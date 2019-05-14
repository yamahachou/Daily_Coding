/**
 * Created by yamahachou on 2018/12/10.
 */
public class String_valid_Palindrome {

//    public static String deleteExtraChar(String s){
//        s = s.toLowerCase();
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < s.length(); i++){
//            if(Character.isLetterOrDigit(s.charAt(i))){
//                sb.append(s.charAt(i));
//            }
//        }
//        return sb.toString();
//    }
//
//    public static boolean isPalindrome(String s){
//        s = deleteExtraChar(s);
//        int start = 0;
//        int end = s.length() - 1;
//        while(start < end){
//            if(s.charAt(start) != s.charAt(end)){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
      public static boolean isPalindrome(String s){
        String actual = s.replaceAll("[^A-Za-z0-9]", "");
        String reverse = new StringBuffer(actual).reverse().toString();
        return actual.equals(reverse);
      }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase();
        System.out.println(isPalindrome(s));

    }
}
