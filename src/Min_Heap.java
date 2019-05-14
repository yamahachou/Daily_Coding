import java.util.PriorityQueue;

/**
 * Created by yamahachou on 2018/11/26.
 */
public class Min_Heap {

    public static void main(String[] args){
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        int[] num = {2,5,6,3,8,5,0,100};
        for(int i = 0 ; i < 5; i++){
            pQueue.add(num[i]);
        }

        for(int i = 5; i< num.length; i++){
            if(num[i] > pQueue.peek()){
                pQueue.add(num[i]);
            }
        }
        System.out.println(pQueue.peek());


    }
}
