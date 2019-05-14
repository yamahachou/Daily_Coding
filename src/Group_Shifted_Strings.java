/**
 * Created by yamahachou on 2018/11/24.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Shifted_Strings {

    public static List<List<String>> groupStrings(String[] strings) {
        if(strings == null || strings.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strings){
            char[] chars = str.toCharArray();
            int shift = chars[0] - 'a';
            for(int i = 0 ; i< chars.length; i++){
                chars[i] = (char)('a'+(chars[i]-shift)%26);
            }
            String key = String.valueOf(chars);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                map.put(key, new ArrayList<>());
                map.get(key).add(str);
            }
        }
        return new ArrayList<>(map.values());

    }

    public static void main(String[] avg){
        String[] strings = { "abc", "bcd", "xyz", "az", "ba", "acef", "a", "z"};
        System.out.println(groupStrings(strings));
    }
}
