package GFG.Medium;

import java.util.PriorityQueue;

public class KthSmalletstElement
{
    public static int findsmallelement(int[] arr,int n,int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }

        int i=0;
        while(i<k-1)
        {
            pq.poll();
            i++;
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        int[] arr = {10,5,4,3,48,6,2,33,53};
        int n = arr.length;
        int k = 3;

        System.out.println(findsmallelement(arr,n,k));
    }
}
