package GFG.Easy;

import java.util.Scanner;

public class MaxConsecutiveOnes
{
    static int maxcounones(int[] arr,int n)
    {
        int count = 0;
        int ans = 0;
        for (int i=0;i<n;i++) {
            if (arr[i]==1) {
                count++;
            } else {
                ans = Math.max(ans,count);
                count=0;
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array : ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Maximum Count of ones is : "+maxcounones(arr,n));
    }
}
