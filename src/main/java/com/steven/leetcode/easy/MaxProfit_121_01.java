package com.steven.leetcode.easy;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意你不能在买入股票前卖出股票。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 * <p>
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class MaxProfit_121_01 {

    public static void main(String[] args) {
//        int[] prices = new int[]{7,1,5,3,6,4};
//        int[] prices = new int[]{7,6,4,3,1};
//        int[] prices = new int[]{2,4,1};
        int[] prices = new int[]{2,1,2,0,1};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        if(prices.length<1){
            return 0;
        }
        int pricesLen = prices.length;
        int i=0,j=pricesLen-1;
        int min=prices[i];
        int max=prices[j];
        while(i<=j){
            int tempMin;
            int tempMax;
            tempMin = prices[i];
            tempMax = prices[j];
             while(min>tempMin&i<=j){
                 min=tempMin;
                 tempMin=prices[i++];
             }
             while(max<tempMax&i<=j&min>max){
                 max = tempMax;
                 tempMax = prices[j--];
             }
             i++;
             j--;
        }
        if(max>=min){
            return max-min;
        }else{
            return 0;
        }
    }
}
