/**
 * Created by yamahachou on 2019/3/19.
 */
public class Combination_Sum_IV {

    public static int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[target+1];
        dp[0] = 0;
        for(int i = 1 ; i <= target ; i++){
            for(int num : nums){
                if(num > i){
                    break;
                }else if(num == i){
                    dp[i] += 1;
                }else{
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        int target = 4;
        System.out.println(combinationSum4(nums, target));
    }
}
