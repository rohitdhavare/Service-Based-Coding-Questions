package GFG.Easy;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestElement
{
    static int secondlarge(int[] arr)
    {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i=n-2;i>=0;i--)
        {
            if (arr[i]!=arr[n-1])
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(secondlarge(arr));
    }
}
