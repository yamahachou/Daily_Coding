import java.util.HashSet;
import java.util.Set;

/**
 * Created by yamahachou on 2018/11/4.
 */
public class First_Missing_Number {
    /*
    In the Beginning I thought I need to find the biggest number to set the limit of the search, but actually not,
    i JUST NEED TO SET I=1 AND KEEP INCREASING THEN SEE WHETHER IT CONTAINED IN THE set.
     */
//    public int FindTheBiggestPositive(int[] arr){
//        int min = Integer.MIN_VALUE;
//        for(int i = 0 ; i < arr.length; i++){
//            if(arr[i]>min && arr[i]>0){
//                min = arr[i];
//            }
//        }
//        if(min<0){
//            return -1;
//        }else
//        return min;
//
//    }

    public int FindFirstMissing(int[] arr){
        Set<Integer> set = new HashSet<>();
        int start = 1;
        for(int i = 0 ; i <arr.length; i++){
            set.add(arr[i]);
        }

        while (set.contains(start)){
            start++;
        }
        return start;
    }

    public static void main(String[] avg){

        First_Missing_Number f = new First_Missing_Number();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int result = f.FindFirstMissing(arr);
        System.out.println(result);
    }
}
