package GFG.Extra14Que;

import java.util.HashMap;
import java.util.Scanner;

// Warana University Question
public class CountSubArraySumK
{
    public static int countsum(int[] arr,int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ans = 0;
        int sum = 0;

        for (int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            if(map.containsKey(sum-target))
            {
                ans+= map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int target = 5;
        System.out.println(countsum(arr,target));

    }
}
