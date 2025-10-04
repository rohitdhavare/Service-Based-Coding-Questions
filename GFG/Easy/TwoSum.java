package GFG.Easy;

import java.util.HashMap;

public class TwoSum
{
    public static int[] twoSum(int[] arr, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int req_sum = target-arr[i];
            if(map.containsKey(req_sum))
            {
                int[] a = {map.get(req_sum),i};
                return a;
            }
            map.put(arr[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {10,11,2,13,15,4};
        int t = 13;
        int[] a = twoSum(arr,t);
        for(int i: a)
        {
            System.out.println(i+" ");
        }
    }
}