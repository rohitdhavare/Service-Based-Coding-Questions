package GFG.Medium;

public class sort012
{
    static void Sorting012(int[] arr)
    {
        int zero =0;
        int one =0;
        int two=0;

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==0)
            {
                zero++;
            } else if (arr[i]==1) {
                one++;
            } else if (arr[i]==2)
            {
                two++;
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            if (zero>0)
            {
                arr[i]=0;
                zero--;
            } else if (one>0) {
                arr[i]=1;
                one--;
            } else if (two>0) {
                arr[i]=2;
                two--;
            }
        }
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,1,2,0,1,1,0};

        Sorting012(arr);
    }
}
