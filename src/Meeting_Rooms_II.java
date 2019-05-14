import java.util.*;
import java.util.PriorityQueue;

/**
 * Created by yamahachou on 2019/4/2.
 */
public class Meeting_Rooms_II {

    public static class Interval{
        int start;
        int end;
        Interval(){
            start = 0;
            end = 0;
        }
        Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public int inMeetingRoom(Interval[] intervals){
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });

        PriorityQueue<Integer> allocator = new PriorityQueue<Integer>(intervals.length, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return a-b;
            }
        });

        allocator.add(intervals[0].end);

        for(int i = 1 ;i < intervals.length; i++){
            if(intervals[i].start >= allocator.peek()){
                allocator.poll();
            }
            allocator.add(intervals[i].end);
        }
        return allocator.size();
    }
}
