/**
 * Created by yamahachou on 2019/3/18.
 */
public class Palindromic_Substring {

    public static int countSubstring(String s){
        int n = s.length();
        int res = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n ; i++){
            for(int j = i ; j >= 0 ; j--){
                if(s.charAt(i) == s.charAt(j) && (i - j < 2 || dp[i - 1][j + 1])){
                    dp[i][j] = true;
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        String a = "abc";
        System.out.println(countSubstring(a));
    }
}
