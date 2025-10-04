package GFG.Medium;
import java.util.Scanner;

public class StackBuySell2
{
    public static int findprofit(int[] arr)
    {
        int buy = 0;
        int sell = 0;
        int profit = 0;
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]>=arr[i-1])
            {
                sell++;
            }
            else {
                profit+=arr[sell]-arr[buy];
                buy=sell=i;
            }
        }
        profit+=arr[sell]-arr[buy];
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(findprofit(arr));
    }
}
