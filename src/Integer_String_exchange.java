import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamahachou on 2018/11/24.
 */
public class Integer_String_exchange {

    public static int makeint(String s, int left, int right){
//        int base = 0;
//        while(right >= left){
//            base += 10*base + (int)s.charAt(left)-'0';
//            left++;
//        }
//        return base;
        int res = Integer.valueOf(s.substring(left, right+1));
        return res;
    }


    public static String exchange(String s){
        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int left = 0;

        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i) - 'a' >=0 && s.charAt(i)-'a'<=25){
                if(left == i){
                    list.add(s.charAt(i));
                }else{
                    char currchar = s.charAt(i);
                    int number = makeint(s, left, i-1);
                    for(int j = 0 ; j < number; j++){
                        list.add(currchar);
                    }
                }
                left = i + 1;
            }
        }

        for(int i = 0 ; i<list.size(); i++){
            sb.append(list.get(i));
        }

        return sb.toString();
    }

    public static void main(String[] avg){
        String s = "9a6ts5r4e13b8yc";
        String res = exchange(s);
        System.out.println(res);
    }
}
