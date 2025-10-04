package GFG.Easy;

import java.util.Scanner;

public class BarChart
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        for (int i=max;i>=1;i--)
        {
            for (int j=0;j<arr.length;j++)
            {
                if (arr[j]>=i)
                {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
