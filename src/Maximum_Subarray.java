import java.util.HashSet;

/**
 * Created by yamahachou on 2019/1/23.
 */
public class Maximum_Subarray {

    public static int maxSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(sum < 0) {
                sum = nums[i];
            }else{
                sum += nums[i];
            }

            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] avgs){
        HashSet<Integer> set = new HashSet<>();

        int[] a = {1,2,3,4,5,6};
        System.out.println(maxSubArray(a));
        

    }

}
