/**
 * Created by yamahachou on 2018/11/19.
 */
public class Length_of_Last_Word {

    public static int lengthOfLastWord(String s) {

        s = s.trim();
        int index = -1;
        int end = s.length()-1;


        for(int i = s.length()-1; i>-1; i--){
            if(s.charAt(i) == ' '){
                index = i;
                break;
            }
        }

        return end - index;

    }

    public static void main(String[] avg){
        String s= "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

}
