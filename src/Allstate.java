/**
 * Created by yamahachou on 2018/12/18.
 */
public class Allstate {

    public static int[] sumarr(int[] nums){
        if(nums.length == 0 || nums == null){
            return nums;
        }
        for(int i = 1 ; i< nums.length; i++){
            nums[i] += nums[i-1];
        }

        return nums;
    }

    public static void main(String[] args){
        int[] arr = {10,22,13};
        int[] ans = sumarr(arr);
        for(int i = 0 ; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
