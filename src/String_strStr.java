/**
 * Created by yamahachou on 2018/12/11.
 */
public class String_strStr {

    public static int strStr(String source, String target){
        if(source== null || target == null){
            return -1;
        }

        for(int i = 0 ; i < source.length(); i++){

            int j = 0;
            for(j = 0; j < target.length(); j++){
                if(source.charAt(i + j) != target.charAt(j)){
                    break;
                }
            }

            if(j == target.length()){
                return i;
            }

        }

        return -1;

    }

    public static void main(String[] args){

        String s = "abevgbcdefg";
        String t = "bcd";
        System.out.println(strStr(s, t));
    }
}
