package GFG.Easy;

import java.util.Scanner;

public class SumOfTwoArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter array element : ");
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }


        System.out.print("Enter the array size : ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.print("Enter array element : ");
        for (int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }

        int[] sum = new int[n>m?n:m];
        int c =0;
        int i=a.length-1;
        int j=b.length-1;
        int k=sum.length-1;

        while (k>=0)
        {
            int d = c;
            if (i>=0)
            {
                d += a[i];
            }
            if (j>=0)
            {
                d += b[j];
            }
            c = d/10;
            d = d%10;

            sum[k] = d;
            i--;
            j--;
            k--;
        }

        System.out.print("The sum of two array is : ");

        if(c!=0)
        {
            System.out.print(c+" ");
        }

        for (int res:sum)
        {
            System.out.print(res+" ");
        }
    }
}
