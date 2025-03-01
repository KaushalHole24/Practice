package Leetcode;

public class stockProfit {
    public static int profit(int stockPrice[]){
        int buyPrice = stockPrice[0];
        int profit = 0;
        
        for(int i=1; i<stockPrice.length; i++){ 
            if(buyPrice < stockPrice[i]){
                profit = Math.max(stockPrice[i] - buyPrice, profit);
            }
            else {
                buyPrice = stockPrice[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int stockPrice[] = {1};
        System.out.println(profit(stockPrice));
    }

}
