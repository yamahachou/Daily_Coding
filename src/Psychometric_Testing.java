import java.util.Arrays;

/**
 * Created by yamahachou on 2019/3/6.
 */
public class Psychometric_Testing {

    public static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
        Arrays.sort(scores);
        int[] res = new int[lowerLimits.length];
        for(int i = 0 ; i < lowerLimits.length; i++){
            int LowerBound = lowerLimits[i];
            int UpperBound = upperLimits[i];
            int number = check(scores, LowerBound, UpperBound);
            res[i] = number;
        }
        return res;
    }
    public static int check(int[] scores, int lower, int upper){
        int start = 0;
        while (scores[start] < lower){
            start++;
        }
        int end = scores.length - 1;
        while (scores[end] > upper){
            end--;
        }
        return end - start + 1;
//        int count = 0;
//        for(int i = 0 ; i< scores.length; i++){
//            if(scores[i] >= lower && scores[i] <= upper){
//                count++;
//            }
//        }
//        return count;
    }

    public static void main(String[] avgs){
        int[] arr = {1,3,5,6,8};
        int[] lower = {2};
        int[] upper = {6};
        int[] res = jobOffers(arr, lower, upper);
        for(int i = 0 ; i< res.length; i++){
            System.out.println(res[i]);
        }
    }
}
