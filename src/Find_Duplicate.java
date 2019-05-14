/**
 * Created by yamahachou on 2019/4/1.
 */
public class Find_Duplicate {

    public static int findDuplicate(int[] nums){
        if(nums.length > 1) {
            int fast = nums[nums[0]];
            int slow = nums[0];

            while (slow != fast) {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            fast = 0;
            while (slow != fast) {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
