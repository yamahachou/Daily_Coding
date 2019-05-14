/**
 * Created by yamahachou on 2019/3/13.
 */
public class Longest_Common_Sequence {

    //naive Solution
    public static int cal(String X, String Y, int m, int n){
        if(m == 0 || n == 0){
            return 0;
        }
        if(X.charAt(m - 1) == Y.charAt(n - 1)){
            return 1 + cal(X, Y, m - 1, n - 1);
        }
        else
            return Math.max(cal(X,Y,m - 1, n), cal(X,Y, m, n -1));
    }

    public static int longestComSeq(String X, String Y){
        int m = X.length();
        int n = Y.length();
        return cal(X, Y, m, n);
    }

    //memoization
//    public static int longestComSeq(String X, String Y){
//
//        int[][] record = new int[][]
//    }

    public static void main(String[] args){
        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int res = longestComSeq(X,Y);
        System.out.println(res);
    }
}
