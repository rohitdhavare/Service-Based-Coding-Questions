package GFG.Easy;

public class ReverseArrayInGroup
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        for (int j=0;j<arr.length;j=j+k)
        {
            int start = j;
            int end = Math.min(j+k-1,arr.length-1);

            // swaping
            while (start<=end)
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
