/**
 * Created by yamahachou on 2018/12/18.
 */
public class String_Longest_Palindrome_substring {

    static String longest = "";

    public static String BruteForce(String s){
        String result = "";
        int max = 0;
        for(int i = 0 ; i< s.length(); i++){
            for(int j = s.length()-1; j>= i ; j--){
                if(isPalindrome(s, i, j) && j-i+1 > max){
                    result = s.substring(i, j+1);
                    max = j-i+1;
                }
            }
        }
        return result;
    }

    private static boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start ++ ;
            end --;
        }
        return true;
    }

    public static String CenterSpread(String s){
        for(int i = 0 ; i< s.length(); i++){
            helper(s, i, 0);
            helper(s, i, 1);
        }

        return longest;
    }

    public static void helper(String s, int index, int length){
        int left = index;
        int right = index + length;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        String currlongest = s.substring(left + 1, right);
        if(currlongest.length() > longest.length()){
            longest = currlongest;
        }

    }

    public static String DynamicProgramming(String s){
        if(s.length() == 0){
            return "";
        }
        int n = s.length(), left = 0, right = 0, max = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < i ; j++){
                if(s.charAt(i) == s.charAt(j) && (i - j < 2 || dp[j+1][i-1])){
                    dp[j][i] = true;
                    System.out.println("i = " + i + " j= " + j + " dp[j][i] = " + dp[j][i]);
                }
                if(dp[j][i] && i - j + 1 > max){
                    max = i - j + 1;
                    System.out.println("max = " + max);
                    left = j;
                    System.out.println("left = " + left);
                    right = i;
                    System.out.println("right = " + right);
                }
            }
            dp[i][i] = true;
        }
        return s.substring(left, right + 1);
    }



    public static void main(String[] args){
        String a = "babad";
        System.out.println(BruteForce(a));
        System.out.println(CenterSpread(a));
        System.out.println(DynamicProgramming(a));
    }
}
