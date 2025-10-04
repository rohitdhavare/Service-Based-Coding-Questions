package GFG.Extra14Que;

import java.util.HashMap;

public class CountPairWithGivenSum {

    public static int countPairs(int[] arr, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int count = 0;
        for (int i=0;i<n;i++)
        {
            int num = arr[i];
            int d = target-num;
            if (map.containsKey(d))
            {
                count+=map.get(d);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, -1, 5};
        int target1 = 6;
        System.out.println(countPairs(arr1, target1)); // Output: 3

        int[] arr2 = {1, 1, 1, 1};
        int target2 = 2;
        System.out.println(countPairs(arr2, target2)); // Output: 6

        int[] arr3 = {10, 12, 10, 15, -1};
        int target3 = 125;
        System.out.println(countPairs(arr3, target3)); // Output: 0
    }
}