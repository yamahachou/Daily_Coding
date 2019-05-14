import java.util.*;
import java.util.PriorityQueue;

/**
 * Created by yamahachou on 2019/4/2.
 */
public class Kth_Largest_Element_in_an_Array {

    public static int findKthLargest(int[] nums, int k){
        int res = 0;
        PriorityQueue<Integer> allocator = new PriorityQueue<Integer>(k, new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        for(int i = 0 ; i < nums.length ; i++){
            allocator.add(nums[i]);
        }
        for(int i = 0 ;i < k; i++){
            res = allocator.poll();
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        findKthLargest(nums, 2);
    }
}
