/**
 * Created by yamahachou on 2018/11/29.
 */

import java.util.ArrayList;
import java.util.List;

public class Prime_Factorization {

    /*
        Brute Force => first created a list that contains every prime number less than num, then check whether it
        can be divided by that prime number
     */


    public static List<Integer> factorize(int n){
//        List<Integer> list = new ArrayList<>();
//        int up = (int)Math.sqrt(n);
//        /*
//         Choose up because we have a * b = n, if a, b both bigger than n(1/2),
//         then it would be a * b > n(1/2) * n(1/2), so that's why we can set k < = up to be the condition since
//         there must be a prime factor that less or equal to n(1/2)
//          */
//        for(int k = 2; k<=up && n > 1; k++){
//            while (n % k == 0){
//                n/=k;
//                list.add(k);
//            }
//        }
//
//        if(n > 1){
//            list.add(n);
//        }
//        return list;
        List<Integer> list = new ArrayList<>();
        int up = (int)Math.sqrt(n);

        for(int k = 2 ; k <= up && n > 1 ; k++){
            while(n % k == 0){
                n/=k;
                list.add(k);
            }
        }

        if(n > 1){
            list.add(n);
        }

        return list;

    }

    public static void main(String[] args){
        int n = 88;
        System.out.println(factorize(n));
    }
}
