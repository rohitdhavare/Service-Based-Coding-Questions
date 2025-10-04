package GFG.Medium;

public class NextPermutation
{
    public static void findpermutation(int[] arr)
    {
        if(arr==null||arr.length==0)
        {
            return;
        }
        int n = arr.length;
        int k = -1;

        // find k
        for (int i=n-2;i>=0;i--)
        {
            if (arr[i]<arr[i+1])
            {
                k=i;
                break;
            }
        }

        // if k==-1
        if (k==-1)
        {
            reverse(arr,0,n-1);
            for (int i : arr)
            {
                System.out.print(i);
            }
            return;
        }
        else {
            for (int i=n-1;i>k;i--)
            {
                if (arr[i]>arr[k])
                {
                    //swap
                    int temp = arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                    break;
                }
            }
        }
        reverse(arr,k+1,n-1);

        for (int i:arr)
        {
            System.out.print(i);
        }
    }
    public static void reverse(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,4,2};
        findpermutation(arr);
    }
}

