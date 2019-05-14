/**
 * Created by yamahachou on 2018/11/25.
 */
import java.util.ArrayList;
import java.util.List;
//Unsolved
// Can't Pass the [""] case.... I do not know why...
public class Decode_Encode_String {

    public static String encode(List<String> strs){
        if(strs == null){
            return null;
        }
        if(strs.size() == 0){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for(String str: strs){
            if(str == null){
                sb.append("-1#");
            }else{
                sb.append(str).append("#");
            }
        }
        return sb.toString();
    }
    public static List<String> decode(String s){
        List<String> list = new ArrayList<>();
        if(s == null){
            return null;
        }
        if(s.equals("")){
            return list;
        }

        String[] record = s.split("#");
        for(String str : record){
            if(str.equals("-1")){
                list.add(null);
            }
            else if(str.length() == 0){
                list.add("");
            }
            else{
                list.add(str);
            }
        }

        return list;

    }

    public static void main(String[] avg){
        List<String> list = new ArrayList<>();

        list.add("");

        System.out.println(list);
        String res = encode(list);
        System.out.println(res);
        System.out.println(decode(res));

    }
}
