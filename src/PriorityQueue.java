import java.util.Comparator;

/**
 * Created by yamahachou on 2019/3/6.
 */

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class PriorityQueue {

        public static Point[] Solution(Point[] array, Point origin, int k) {
            Point[] rvalue = new Point[k];
            int index = 0;
            java.util.PriorityQueue<Point> pq = new java.util.PriorityQueue<>(k, new Comparator<Point>() {
                @Override
                public int compare(Point a, Point b) {
                    return (int) (getDistance(a, origin) - getDistance(b, origin));
                }
            });

            for (int i = 0; i < array.length; i++) {
                pq.offer(array[i]);
                if (pq.size() > k)
                    pq.poll();
            }
            while (!pq.isEmpty())
                rvalue[index++] = pq.poll();
            return rvalue;
        }
        private static double getDistance(Point a, Point b) {
            return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
        }

    public static void main(String[] avgs){
        Point p1 = new Point(1,2);
        Point p2 = new Point(2,2);
        Point p3 = new Point(2,3);
        Point p4 = new Point(1,5);
        Point p5 = new Point(4,2);
        Point p6 = new Point(3,2);

        Point[] array = {p1,p2,p3,p4,p5,p6};
        Point origin = new Point(0,0);
        int k = 3;

        Point[] arr = Solution(array, origin, k);
        System.out.println(arr[0].x);


    }
}
