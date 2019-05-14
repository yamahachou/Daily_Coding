/**
 * Created by yamahachou on 2019/3/10.
 */
public class DynamicProgramming_Gold_Mine {

    //窮舉法
//    public static int CalVal(int W, int[] weight, int[] val, int n){
//        if(n == 0 || W == 0){
//            return 0;
//        }
//        if(W < weight[n - 1]){
//            return CalVal(W, weight, val, n - 1);
//        }
//        else
//            return Math.max(CalVal(W, weight, val, n - 1), val[n - 1] +
//                            CalVal(W-weight[n - 1],weight, val, n - 1));
//    }

    public static int CalVal(int W, int[] weight, int[] val, int n){
        int[][] record = new int[n+1][W+1];
        for(int i = 0 ; i<=n ; i++){
            for(int w = 0 ; w <= W; w++){
                if(i == 0 || w == 0){
                    record[i][w] = 0;
                }else if(weight[i - 1] > w){
                    record[i][w] = record[i - 1][w];
                }else
                    record[i][w] = Math.max(record[i - 1][w], val[i - 1] + record[i - 1][w - weight[i - 1]]);
            }
        }
        return record[n][W];
    }


    public static void main(String[] avgs){
        int W = 100;
        int[] val = new int[]{92, 22, 87, 46, 90};
        int[] weight = new int[]{77, 22, 29, 50, 99};
        int n = val.length;
        int res = CalVal(W, weight, val, n);
        System.out.println(res);


    }
}
