/**
 * Created by yamahachou on 2018/11/22.
 */
public class Find_The_Largest_Number {

    public static int largest(int[] num){
        int res = Integer.MIN_VALUE;
        for(int i = 0 ; i< num.length; i++){
            if(res < num[i]){
                res = num[i];
            }
        }

        return res;
    }

    public static void main(String[] avg){
        int[] num= {3,6,5,2,8,9,33,66};
        System.out.println(largest(num));
    }
}
