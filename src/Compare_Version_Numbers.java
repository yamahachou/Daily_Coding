/**
 * Created by yamahachou on 2019/3/31.
 */
public class Compare_Version_Numbers {

    public static int compareVersion(String version1, String version2){
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int length = Math.max(v1.length, v2.length);
        for(int i = 0 ; i < length; i++){
            Integer num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            Integer num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            int compare = num1.compareTo(num2);
            if(compare != 0){
                return compare;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        String a = "1.1.001.0";
        String[] arr = a.split("\\.");
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(Integer.parseInt(arr[2]));
    }
}
