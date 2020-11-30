import java.text.*;

class Profit
{
    public static int getMaxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;

        if (prices.length == 1)
            return -prices[0];

        int minPrice = prices[0];
        int maxProfit =  prices[1] - prices[0];

        for (int current = 1; current < prices.length; current++) {
            int currentPrice = prices[current];

            if (currentPrice - minPrice > maxProfit)
                maxProfit = currentPrice - minPrice;

            if (currentPrice < minPrice)
                minPrice = currentPrice;
        }

        return maxProfit;
    }


    public static void main(String[] args) {
        int[] stockPrices =  {7, 2, 8, 9};
        // int[] stockPrices =  {9, 7, 4, 1};
        // int[] stockPrices =  {1, 1, 1, 1};

        int profit = getMaxProfit(stockPrices);
        System.out.println(MessageFormat.format("Maximum Possible Profit: {0}", profit));
    }

}