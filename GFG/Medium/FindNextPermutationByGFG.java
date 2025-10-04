package GFG.Medium;

public class FindNextPermutationByGFG {
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
    public static void nextPermutation(int[] arr) {
        // code here
        if(arr == null || arr.length==0)
        {
            return;
        }
        int n = arr.length;
        int k = -1;

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                k=i;
                break;
            }
        }
        if(k==-1)
        {
            reverse(arr,0,n-1);
            return;
        }
        else
        {
            for(int i=n-1;i>k;i--)
            {
                if(arr[i]>arr[k])
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

    }

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        nextPermutation(arr);
    }
}
