import java.util.*;

/**
 * Created by yamahachou on 2019/3/5.
 */
class Result{
    int productID;
    int rank;
    public Result(int productID, int rank){
        this.productID = productID;
        this.rank = rank;
    }
}
public class High_Five {

    public static Map<Integer, Double> getHighFive(Result[] result){
        HashMap<Integer, Double> map = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> value = new HashMap<>();

        for(Result res : result){
            int id = res.productID;
            if(value.containsKey(id)){
                ArrayList<Integer> list = value.get(id);
                list.add(res.rank);
                value.put(id, list);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(res.rank);
                value.put(id, list);
            }
        }

        for(Integer id : value.keySet()){
            ArrayList<Integer> list = value.get(id);
            Collections.sort(list);
            Collections.reverse(list);
            double five = 0;
            for(int i = 0 ; i < 5 ; i++){
                five += list.get(i);
            }
            double avg = five / 5.0;
            map.put(id, avg);
        }
        return map;
    }

    public static void main(String[] args) {
        Result r1 = new Result(1, 95);
        Result r2 = new Result(1, 95);
        Result r3 = new Result(1, 91);
        Result r4 = new Result(1, 91);
        Result r5 = new Result(1, 93);
        Result r6 = new Result(1, 105);

        Result r7 = new Result(2, 6);
        Result r8 = new Result(2, 6);
        Result r9 = new Result(2, 7);
        Result r10 = new Result(2, 6);
        Result r11 = new Result(2, 6);
        Result[] arr = {r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
        Map<Integer, Double> res = getHighFive(arr);
        System.out.println(res.get(2));
    }


}
