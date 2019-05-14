/**
 * Created by yamahachou on 2019/3/18.
 */
public class Best_Time_Sell_Stock {

    public static int maxProfit(int[] prices) {
        int[] res = new int[prices.length];
        res[0] = 0;
        int minPrice = prices[0];

        for(int i = 1 ; i < prices.length; i++){
            if(prices[i] >=  minPrice){
                res[i] = Math.max(res[i - 1], prices[i] - minPrice);
            }
            if(prices[i] < minPrice){
                res[i] = res[i - 1];
            }
        }

        return res[prices.length - 1];
    }

    public static void main(String[] args){
        int[] num = {7,1,5,3,6,4};
        System.out.println(maxProfit(num));
    }
}
