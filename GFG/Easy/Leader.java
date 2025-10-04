package GFG.Easy;

import java.util.ArrayList;

public class Leader
{
    public static ArrayList<Integer> findleader(int[] arr)
    {
        int max = arr[arr.length-1];

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(max);
        for (int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                temp.add(arr[i]);
                max=arr[i];
            }

        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        findleader(arr);

    }
}
