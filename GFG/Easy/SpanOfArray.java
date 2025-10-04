package GFG.Easy;

import java.util.Scanner;

public class SpanOfArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
            if (arr[i]<min)
            {
                min = arr[i];
            }

        }
        System.out.println("Max is : "+max);
        System.out.println("Min is : "+min);
        System.out.println("The span is : "+(max-min));

    }
}
