package GFG.Extra14Que;

public class Cyclicallyrotateanarraybyone
{
    public static void rotate(int[] arr)
    {

        int n = arr.length;
        int temp = arr[n-1];
        for (int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        for (int i:arr)
        {
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr);
    }
}
