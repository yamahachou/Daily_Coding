import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yamahachou on 2019/4/1.
 */
public class Meeting_Room {

    public static class Interval{
        int start;
        int end;

        Interval(){
            start = 0 ;
            end = 0;
        }

        Interval(int start, int end){
            start = this.start;
            end = this.end;
        }
    }

    public static boolean canAttendMeetings(Interval[] intervals){
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });

        for(int i = 0 ;i < intervals.length - 1; i++){
            if(intervals[i].end > intervals[i + 1].start){
                return false;
            }
        }
        return true;
    }

}
