import java.util.Arrays;

/**
 * Created by yamahachou on 2019/3/19.
 */
public class Unique_Binary_Search_Trees {

    public static int numTrees(int n){
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        memo[0] = 1;
        memo[1] = 1;

        return numTrees(n, memo);
    }
    private static int numTrees(int n, int[] memo){
        if(memo[n] != -1){
            return memo[n];
        }

        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            int left = numTrees(n - i - 1, memo);
            memo[n - i - 1] = left;
            int right = numTrees(i, memo);
            memo[i] = right;
            sum += left * right;
        }

        return sum;
    }
//    public static int numTrees(int n) {
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for(int i = 2 ; i <= n ; i++){
//            for(int j = 1; j <= i ; j++){
//
//                dp[i] += dp[j - 1] * dp[i - j];
//            }
//        }
//        return dp[n];
//    }

    public static void main(String[] args){
        int n = 3;
        System.out.println(numTrees(3));
    }
}
