/**
 * Created by yamahachou on 2019/3/11.
 */
public class First_Unique_Char {

    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(int i = 0 ; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < s.length(); i++){
            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] avgs){
        String a = "leetcode";
        int res = firstUniqChar(a);
        System.out.println(res);
    }
}
