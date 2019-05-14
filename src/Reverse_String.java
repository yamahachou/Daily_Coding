/**
 * Created by yamahachou on 2018/11/22.
 */
public class Reverse_String {

    public static void swap(char a, char b){
        char temp = a;
        a = b;
        b = temp;
    }

   public static void reverse(char[] s){
       int start = 0;
       int end = s.length - 1;
       while (start < end){
           char temp = s[start];
           s[start] = s[end];
           s[end] = temp;
           start++;
           end--;
       }
   }

   public static void main(String[] avg){
       char[] s = {'h','e','l','l','o'};
       reverse(s);
       for(int i = 0 ; i< s.length; i++){
           System.out.print(s[i]+" ");
       }
   }
}
