package GFG.Extra14Que;

import java.util.HashSet;

public class ArrayAsubsetB
{
    public static boolean isSubset(int[] a,int[] b)
    {
        HashSet<Integer> hs = new HashSet<>();
        for (int i: a)
        {
            hs.add(i);
        }

        for (int num : b)
        {
            if(!hs.contains(num))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 5};

        if (isSubset(arr1, arr2)) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is NOT a subset of arr1");
        }
    }
}
