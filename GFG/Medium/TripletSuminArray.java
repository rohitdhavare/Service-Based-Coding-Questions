package GFG.Medium;

import java.util.Arrays;

public class TripletSuminArray
{
    public static boolean FindTripletSum(int[] arr,int t)
    {
        Arrays.sort(arr);
        int l = arr.length;
        for (int i=0;i<l;i++)
        {
            int left = i+1;
            int rigth = l-1;
            while (left < rigth)
            {
                int sum = arr[i] + arr[left] + arr[rigth];
                if (sum == t) {
                    return true;
                } else if (sum < t) {
                    left++;
                }
                else{
                    rigth--;
                }
            }
        }
         return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,10,14};
        int t = 13;
        System.out.println(FindTripletSum(arr,t));
    }
}


/*
* class Solution {
    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<arr.length-2;i++)
        {
            int r = n-1;
            int l = i+1;
            if(i>0 && arr[i]==arr[i-1])continue;
            while(l<r)
            {
                int sum = arr[i]+arr[l]+arr[r];
                if(sum==0)
                {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[l]);
                    triplet.add(arr[r]);
                    result.add(triplet);
                    while (l < r && arr[l] == arr[l + 1]) l++;
                    while (l < r && arr[r] == arr[r - 1]) r--;
                    l++;
                    r--;
                }
                else if(sum>0){
                    r--;
                }
                else if(sum<0){
                    l++;
                }
            }

        }
        return result;
    }
}
* */