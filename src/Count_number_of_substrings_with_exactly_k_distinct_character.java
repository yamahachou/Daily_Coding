import java.util.HashSet;

/**
 * Created by yamahachou on 2019/3/4.
 */
public class Count_number_of_substrings_with_exactly_k_distinct_character {

//    public static boolean iskDistinct(String str, int k){
//        HashSet<Character> set = new HashSet<>();
//        for(int i = 0 ; i < str.length(); i++){
//            set.add(str.charAt(i));
//        }
//
//        return set.size()==k;
//    }

//    public static int Count(String str, int k){
//        int count = 0;
//
//        for(int i = 0 ; i< str.length(); i++){
//            for(int j = i; j < str.length(); j++){
//                String test = str.substring(i, j+1);
//                System.out.println(test);
//                if(iskDistinct(test,k)){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    public static int Count(String str, int k){
        if(k == 0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int result = 0;
        for(int i = 0 ; i< str.length();i++){

            //Current Distinct Character Number
            int count = 0;
            set.clear();

            for(int j = i ; j<str.length(); j++){
                if(!set.contains(str.charAt(j))){
                    count++;
                }

                set.add(str.charAt(j));

                if(count == k){
                    result++;
                }
                if(count>k){
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] avgs){
        String a = "aa";
        int k = 0;
        int result = Count(a,k);
        System.out.println(result);
    }
}
