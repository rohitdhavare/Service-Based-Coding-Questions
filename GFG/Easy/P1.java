package GFG.Easy;

import java.util.Scanner;

public class P1
{
    public static void reverse(int[] arr,int start,int end)
    {
        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k =3;
        for(int i=0;i<arr.length;i=i+k)
        {
            int start = i;
            int end = Math.min(i+k-1,arr.length-1);

            while (start<end)
            {
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        for (int m:arr)
        {
            System.out.print(m+" ");
        }
    }
}
