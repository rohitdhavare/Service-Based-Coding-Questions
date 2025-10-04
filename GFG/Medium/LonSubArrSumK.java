package GFG.Medium;
import java.util.HashMap;

class LonSubArrSumK {

    public static int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int len = 0;

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];

            if(sum==k)
            {
                len=i+1;
            }
            if(map.containsKey(sum-k))
            {
                len = Math.max(len,i-map.get(sum-k));
            }

            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }

        }
        return len;

    }


    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k=15;
        System.out.println(longestSubarray(arr,k));
    }
}

