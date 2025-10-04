package GFG.Medium;

import java.util.HashMap;

public class P1
{
    public static int findsoln(int[] arr,int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int len = 0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if (sum==k)
            {
                len = i+1;
            }
            if (map.containsKey(sum-k))
            {
                len = Math.max(len,i-map.get(sum-k));
            }
            if (!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k = 15;
        System.out.println(findsoln(arr,k));
    }
}