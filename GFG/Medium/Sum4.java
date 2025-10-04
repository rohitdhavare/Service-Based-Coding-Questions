package GFG.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4
{
    public static List<List<Integer>> find4sum(int[] arr, int target)
    {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i=0;i<n-3;i++)
        {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j=i+1;j<n-2;j++)
            {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue; // skip duplicate j
                int left = j+1;
                int right = n-1;

                while (left<right)
                {
                    long sum = (long)arr[i]+arr[j]+arr[left]+arr[right];
                    if (sum==target)
                    {
                        result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        // skip duplicates for left
                        while (left < right && arr[left] == arr[left + 1]) left++;
                        // skip duplicates for right
                        while (left < right && arr[right] == arr[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum<target) {
                        left++;
                    } else if (sum>target) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 10;
        System.out.println(find4sum(arr,target));
    }
}



/*
* class Solution {
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n-3;i++)
        {
            if(i>0 && arr[i]==arr[i-1])continue;
            for(int j=i+1;j<n-2;j++)
            {
                if(j>i+1 && arr[j]==arr[j-1])continue;
                int left = j+1;
                int rigth = n-1;
                while(left<rigth)
                {
                    long sum = (long)arr[i]+arr[j]+arr[left]+arr[rigth];
                    if(sum==target)
                    {
                        result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[rigth]));
                        while(left<rigth && arr[left]==arr[left+1])left++;
                        while(left<rigth && arr[rigth]==arr[rigth-1])rigth--;
                        left++;
                        rigth--;
                    }
                    else if(sum<target)
                    {
                        left++;
                    }
                    else if(sum>target)
                    {
                        rigth--;
                    }
                }
            }
        }
        return result;
    }
}
* */
