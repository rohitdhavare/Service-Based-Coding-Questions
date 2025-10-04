package GFG.Medium;

import java.util.ArrayList;

public class CommonElemThreeArray
{
    public static ArrayList<Integer> commonel(int[] a,int[] b,int[] c)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        int n3 = c.length;

        int i=0;
        int j=0;
        int k=0;

        while (i<n1 && j<n2 && k<n3)
        {
            if (a[i]==b[j] && b[j]==c[k])
            {
                if (!list.contains(a[i]))
                {
                    list.add(a[i]);
                }
                i++;
                j++;
                k++;
            } else if (a[i]<b[j]) {
                i++;
            } else if (b[j]<c[k]) {
                j++;
            }
            else {
                k++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {3,5,6,7,9};
        int[] b = {1,2,3,4,5};
        int[] c = {2,3,6,8,10};

        ArrayList<Integer> l = new ArrayList<>(commonel(a,b,c));
        System.out.println(l);
    }
}
