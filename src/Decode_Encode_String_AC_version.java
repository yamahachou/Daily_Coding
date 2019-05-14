import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamahachou on 2018/11/26.
 */
public class Decode_Encode_String_AC_version {

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append("/").append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0 ;
        while(i < s.length()){
            int slash = s.indexOf('/', i);
            int size = Integer.valueOf(s.substring(i, slash));
            res.add(s.substring(slash+1, slash+size+1));
            i = slash + size + 1;
        }

        return res;
    }

    public static void main(String[] avg){
        List<String> list = new ArrayList<>();

        list.add("Marry");
        list.add("Harry");
        list.add("");
        list.add("Potter");

        System.out.println(list);
        String res = encode(list);
        System.out.println(res);
        System.out.println(decode(res));

    }
}
