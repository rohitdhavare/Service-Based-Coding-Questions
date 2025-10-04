package GFG.Medium;


import java.util.Arrays;

public class MergeTwoArray
{
    public static void mergearray(long[] a,long[] b)
    {
        int m = b.length-1;
        int k = a.length-1;
        int i=0;
        int j=0;
        while (i<k && j<m)
        {
            if (a[i]<b[j])
            {
                i++;
                continue;
            }
            else {
                long temp = a[k];
                a[k]=b[j];
                b[j]=temp;
                j++;
                k--;
            }
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        long[] a = {1,3,8,4,5};
        long[] b = {2,6,7,4,9};

        mergearray(a,b);
    }
}
