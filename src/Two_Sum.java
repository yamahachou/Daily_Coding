import java.util.HashMap;

/**
 * Created by yamahachou on 2019/3/28.
 */
public class Two_Sum {

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] nums = {2,5,7,9};
        int target = 9;

        int[] res = twoSum(nums, target);

        for(int i = 0 ; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
