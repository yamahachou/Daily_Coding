/**
 * Created by yamahachou on 2019/3/6.
 */
public class Pseudo {
    public static int count(int a, int b){
        int x = a;
        int y = b;
        while(x != y){
            if(x > y){
                x= x - y;
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }
            if(x < y){
                y = y - x;
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }
        }
        return x;
    }
    public static void main(String[] avgs){
        System.out.println(count(2437, 875));
    }
}
