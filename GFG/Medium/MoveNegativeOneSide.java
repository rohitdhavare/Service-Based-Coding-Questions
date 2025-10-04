package GFG.Medium;

public class MoveNegativeOneSide
{
    public static void movenegative(int[] arr)
    {
        int j=-1;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]<0)
               {
                   j++;
                   int temp = arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
               }
        }
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,-2,-3,4,5,-6,-7};
        movenegative(arr);
    }
}
