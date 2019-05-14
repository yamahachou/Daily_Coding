import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yamahachou on 2019/3/29.
 */
public class Three_Sum {

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0){
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 1; i++){
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k){
                int sum = nums[i] + nums[j] +nums[k];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }
                if(sum > 0){
                    k--;
                }
                if(sum < 0 ){
                    j++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {1, 3, 5, -4, 7, 2, 4, -6};
        System.out.println(threeSum(nums));
    }
}
