/**
 * Created by yamahachou on 2019/3/29.
 */
public class Reverse_Words_in_a_string_II {

    public static void reverseWords(char[] str){
        int start = 0;
        reverse(str, start, str.length - 1);
        for(int i = 0 ; i < str.length ; i++){
            if(str[i] == ' '){
                reverse(str, start, i - 1);
                start = i + 1;
            }
        }
        reverse(str, start, str.length - 1);
    }

    public static void reverse(char[] arr, int left, int right){
        char temp;

        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] avgs){
        char[] str = {'t', 'h', 'e',' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
        reverseWords(str);
        for(int i = 0 ;i < str.length; i++){
            System.out.print(str[i]);
        }





    }
}
