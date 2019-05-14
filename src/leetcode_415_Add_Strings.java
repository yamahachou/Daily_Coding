/**
 * Created by yamahachou on 2018/11/14.
 */
public class leetcode_415_Add_Strings {
    //In the beginning,
    public static String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (i>0 || j>0 || carry!=0){
            sum += ((i>=0 ? (num1.charAt(i--)-'0'):0) + (j>=0 ? (num2.charAt(j--)-'0'):0)) + carry;
            sb.append(sum%10);
            carry/=10;
        }

        return sb.toString();

    }

    public static void main(String[] avg){

        System.out.println(17 % 10);
    }
}
