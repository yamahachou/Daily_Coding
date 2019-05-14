import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by yamahachou on 2019/3/5.
 */
public class Count_number_of_substrings_with_exactly_k_distinct_character_K_LENGTH {

    public static List<String> verifyK(String str, int k){
        int len = str.length();
        List<String> list = new ArrayList<>();
        int bound = len - k;

        for(int i = 0 ; i <= bound ; i++){
            String temp = str.substring(i, i+k);
            if(check(temp, k)){
                list.add(temp);
            }
        }
        return list;
    }

    public static boolean check(String str, int k){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < str.length(); i++){
            set.add(str.charAt(i));
        }
        if(set.size() == k){
            return true;
        }
        return false;
    }

    public static void main(String[] avgs){

        String str = "aba";
        System.out.println(verifyK(str, 2));
    }
}
