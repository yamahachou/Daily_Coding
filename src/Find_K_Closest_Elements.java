import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamahachou on 2019/1/17.
 */
public class Find_K_Closest_Elements {

    public static List<Integer> findClosestElements(int[] arr, int target, int size) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length; i++){
            list.add(arr[i]);
        }
        while(list.size() > size){
            if(target - list.get(0) <= list.get(list.size() - 1) - target){
                list.remove(list.get(list.size() - 1));
            }else{
                list.remove(list.get(0));
            }
        }

        return list;
    }

    public static int[] kclosestNumbers(int[] A, int target, int k){
        int left = findLowerCloser(A, target);
        int right = left + 1;
        int[] res = new int[k];

        for(int i = 0 ; i < k ; i ++){
            if(isLeftCloser(A, target, left, right)){
                res[i] = A[left];
                left --;
            }else{
                res[i] = A[right];
                right ++;
            }
        }
        return res;
    }

    public static boolean isLeftCloser(int[] A, int target, int left, int right){
        if(left < 0){
            return false;
        }
        if(right >= A.length){
            return true;
        }
        if(target - A[left] != A[right] - target){
            return target - A[left] < A[right] - target;
        }

        return true;
    }

    public static int findLowerCloser(int[] a, int target){
        int start = 0;
        int end = a.length - 1;

        while(start + 1 < end){
            int mid = (start + end) / 2;
            if(a[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }

        if(a[end] < target){
            return end;
        }
        if(a[start] < target){
            return start;
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,4,5,6,7,10,13,15,18,19,23,26};
        int[] a = kclosestNumbers(arr, 17, 6);
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }
    }
}
