package simple;

/**
 * 买卖股票的最佳时机，只进行一次交易
 *
 * O(n)就能解决，定义3个变量，分别是最小值、最大值和最大收益
 * 当最小值发生变化时，最大值要等于最小值，目的是防止数组极大值在首位
 */

public class BestTimeToBuyAndSellStock_0121 {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }

    public static int maxProfit(int[] prices) {
        int ret = 0;
        int minValue = prices[0];
        int maxValue = prices[0];
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > maxValue){
                maxValue = prices[i];
                ret = Math.max(ret, maxValue - minValue);
            }else if (prices[i] < minValue){
                minValue = prices[i];
                maxValue = prices[i];
            }
        }
        return ret;
    }
}
