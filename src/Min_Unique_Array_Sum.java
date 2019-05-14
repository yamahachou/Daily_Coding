import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yamahachou on 2019/3/6.
 */
public class Min_Unique_Array_Sum {

    public static int getMinimumUniqueSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int sum = arr.get(0);
        System.out.println(sum);
        int prev = arr.get(0);
        for(int i = 1 ; i < arr.size(); i++){
            int cur = arr.get(i);
            if(prev >= cur){
                cur = prev + 1;
            }
            sum += cur;
            prev = cur;
        }

        return sum;
    }

    public static void main(String[] avgs){
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(2);

        System.out.println(getMinimumUniqueSum(arr));
    }
}
