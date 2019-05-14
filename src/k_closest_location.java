import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by yamahachou on 2019/3/6.
 */
public class k_closest_location {

    List<List<Integer>> ClosestDestination(int numDestination, List<List<Integer>> allocations, int numDeliveries){
        List<List<Integer>> res = new ArrayList<>();
        if(allocations == null || allocations.size() == 0 || allocations.get(0) == null || allocations.get(0).size() == 0
            || numDestination == 0 || numDeliveries == 0 || numDestination != allocations.size())
            return res;
        if(numDestination == numDeliveries){
            return allocations;
        }

        PriorityQueue<List<Integer>> maxHeap = new PriorityQueue<>(numDeliveries + 1, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                return (long)b.get(0) * (long)b.get(0) + (long)b.get(1) * (long)b.get(1) -
                        (long)a.get(0) * (long)a.get(0) + (long)a.get(1) * (long)a.get(1)<0? -1 : 1;
            }
        });

        for(List<Integer> location : allocations){
            maxHeap.offer(location);
            if(maxHeap.size() > numDeliveries){
                maxHeap.poll();
            }
        }
        for(int i = 0 ; i< numDeliveries; i++){
            res.add(maxHeap.poll());
        }
        return res;
    }
}
