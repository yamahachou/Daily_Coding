/**
 * Created by yamahachou on 2019/3/18.
 */
public class Longest_Palindromic_Subsequence {

    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for(int i = 0 ; i < n ; i++){
            dp[i][i] = 1;
        }
        for(int len = 1 ; len < n ; len++){
            for(int i = 0 ; i < n ; i++){
                int j = i + len;
                if(j >=n ){
                    break;
                }
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }

    public static void main(String[] args){
        String s = "cbbd";
        System.out.println(longestPalindromeSubseq(s));
    }
}
