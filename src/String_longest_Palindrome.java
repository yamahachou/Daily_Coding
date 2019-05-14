import java.util.HashSet;
import java.util.Set;

/**
 * Created by yamahachou on 2018/12/11.
 */
public class String_longest_Palindrome {

    public static int longestPalindrome(String s){
        Set<Character> hashset = new HashSet<>();
        int count = 0;
        for(int i =0 ; i< s.length(); i++){
            if(hashset.contains(s.charAt(i))){
                hashset.remove(s.charAt(i));
                count++;
            }else{
                hashset.add(s.charAt(i));
            }
        }

        if(!hashset.isEmpty()){
            return count * 2 + 1;
        }else {
            return count * 2;
        }
    }

    public static void main(String[] args){
        String s = "abccccdd";
        int res = longestPalindrome(s);
        System.out.println(res);
    }
}
