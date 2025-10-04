package GFG.Easy;

import java.util.HashSet;

public class MissingAndRepetative
{
    public static void findMR(int[] arr, int n)
    {
        HashSet<Integer> s = new HashSet<>();
        int r=0;
        for (int i=0;i<n;i++)
        {
            if (!s.contains(arr[i]))
            {
                s.add(arr[i]);
            }
            else {
                r += arr[i];
            }
        }
        int m =0;
        for (int i=1;i<=n;i++)
        {
            if (!s.contains(i))
            {
                m = i;
            }
        }
        System.out.println("Missing : "+m);
        System.out.println("Repetating : "+r);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,4,5,6,7,8,9};
        int n = arr.length;
        findMR(arr,n);
    }
}
