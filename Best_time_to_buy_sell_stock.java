import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.util.*;;

public class Best_time_to_buy_sell_stock {
    public static int maxProfit(int[] prices) {
    // THIS SOLUTION TAKES O(n) TIME COMPLEXITY AND SPACE IS O(N)
       int maxFar = Integer.MIN_VALUE;
       int[] aux = new int[prices.length];

       for(int i=prices.length-1;i>=0;i--){
            if(prices[i] > maxFar){
                maxFar = prices[i];
            }
            aux[i] = maxFar;
       }
       
       int maxProfit = Integer.MIN_VALUE;
       
       for(int i=0;i<prices.length;i++){
           int profit = aux[i] - prices[i];
           if(maxProfit < profit){
               maxProfit = profit;
           }
       }

    return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        // THIS PROGRAM RUNS IN O(n) WITH NO EXTRA SPACE

        int minBuy = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 0 ;i<prices.length ;i++){
            if(minBuy > prices[i]){
                minBuy = prices[i];
            }
            int currProfit = prices[i] - minBuy;
            if(maxProfit < currProfit){
                maxProfit = currProfit;
            }
        }

        return maxProfit;
    }



       public static void main(String[] args) {
           int[] prices = new int[]{7,1,5,3,6,4};
           int res = maxProfit2(prices);
           System.out.println(res);
       }
}
