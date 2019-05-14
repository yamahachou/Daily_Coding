/**
 * Created by yamahachou on 2019/2/19.
 */
public class Car {
    void run()
    {
        System.out.println("car is running");
    }
}
class Audi extends Car {
    void run()
    {
        System.out.print("Audi is running safely with 100km");
    }


    public static void main(String args[])
    {
        Car b= new Audi();    //upcasting
        b.run();
    }
}