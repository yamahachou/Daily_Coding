/**
 * Created by yamahachou on 2019/2/12.
 */
public class Valid_Palindrome_II {
    private static boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static  boolean validPalindrome(String s) {
        if(s.length() == 0 || s == null){
            return true;
        }

        int start = 0, end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return isPalindrome(s, start+1, end) || isPalindrome(s, start, end-1);
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args){

        String s = "abvnkba";
        System.out.println(validPalindrome(s));
    }
}
