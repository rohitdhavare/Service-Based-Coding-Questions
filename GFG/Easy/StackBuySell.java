package GFG.Easy;

import java.util.Scanner;

public class StackBuySell
{
    public static void solution(int[] prices)
    {
        int buy_price = prices[0];
        int profit = 0;

        for (int i=1;i<prices.length;i++)
        {
            if (prices[i]<buy_price)
            {
                buy_price=prices[i];
            }
            else {
                int curr_profit = prices[i]-buy_price;
                profit = Math.max(curr_profit,profit);
            }
        }
        System.out.println(profit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter prices : ");
        for (int i=0;i<prices.length;i++)
        {
            prices[i]=sc.nextInt();
        }

        solution(prices);
    }
}
