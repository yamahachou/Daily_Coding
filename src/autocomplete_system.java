import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamahachou on 2018/11/10.
 */
public class autocomplete_system {
    public static List<String> autocomplete(String prefix, String[] target){
        int end = prefix.length();
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < target.length; i++){
            String pre = target[i].substring(0, end);
            if(!prefix.equals(pre)){
                continue;
            }else{
                list.add(target[i]);
            }
        }
        return list;
    }

    public static void main(String[] avg){

        String begin = "de";
        String[] arr = {"dog", "deer", "deal"};
        System.out.println(autocomplete(begin,arr));


    }

}
