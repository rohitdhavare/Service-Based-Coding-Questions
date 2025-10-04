package GFG.Easy;

import java.util.Scanner;

public class RotateArray
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


    public static void rotatearr(int[] arr,int k)
    {
        k = k%arr.length;

        //revrse whole array

        reverse(arr,0,arr.length-1);


        //revrse first element
        reverse(arr,0,arr.length-k-1);


        //revrse last lement
        reverse(arr,arr.length-k,arr.length-1);

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :");
        int n = sc.nextInt();
        System.out.print("Enter k number : ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array element : ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        rotatearr(arr,k);
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
