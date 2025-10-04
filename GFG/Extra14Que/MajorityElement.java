package GFG.Extra14Que;

import java.io.*;
import java.util.*;

public class MajorityElement {

    public static int findmajor(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int candidate = Integer.MAX_VALUE;

        for (int num : arr) {
            int f = freq.get(num);
            if (f >= maxFreq) {
                maxFreq = f;
                candidate = num;
            }
        }

        return candidate;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(findmajor(arr));
    }
}