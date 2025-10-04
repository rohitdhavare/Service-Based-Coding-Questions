package GFG.Extra14Que;

import java.util.HashSet;

public class SubArraySumZero
{
    public static boolean find(int[] arr)
    {
        HashSet<Integer> hs = new HashSet<>();
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        // if sum 0 occures || if element 0 occure || if sum exist repeated
            if (sum==0 || arr[i]==0 ||  hs.contains(sum))
            {
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println(find(arr));
    }
}
