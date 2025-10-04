package GFG.Medium;

import java.util.PriorityQueue;

public class KthLargestElmt
{
    public static int kthlarg(int[] arr,int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        int n = pq.size();
        for (int i=n;i>k;i--)
        {
            pq.poll();
        }
        return pq.poll();
    }
    public static void main(String[] args) {

        int[] arr ={2,4,1,6,3,7,20};
        int k = 1;
        System.out.println(kthlarg(arr,k));
    }
}
