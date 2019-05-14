/**
 * Created by yamahachou on 2019/3/31.
 */
public class Product_of_Array_Except_Self {

    public static int[] productExceptSelf(int[] nums){
        int[] res = new int[nums.length];
        res[0] = 1;

        for(int i = 1; i < nums.length; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;
        for(int i = nums.length - 1; i >=0; i--){
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    public static void main(String[] args){

        int[] nums = {0, 3,4,5,7};
        int[] nums2 = {1,2,3,4};
        int[] res = productExceptSelf(nums);
        int[] res2 = productExceptSelf(nums2);

        for(int i = 0 ; i < res2.length; i++){
            System.out.print(res2[i] + " ");
        }
        System.out.println(20%1000);

    }
}
