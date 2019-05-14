/**
 * Created by yamahachou on 2018/11/24.
 */
public class Fibonacci {

    public static int fibo(int i){

        if(i == 0){
            return 0;
        }

        if(i==1 || i==2){
            return 1;
        }

        return fibo(i-1)+fibo(i-2);

    }

    public static void main(String[] avg){

        System.out.println(fibo(10000));
    }
}
