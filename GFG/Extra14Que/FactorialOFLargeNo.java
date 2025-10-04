package GFG.Extra14Que;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FactorialOFLargeNo
{
    public static ArrayList<Integer> findfact(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int size = 1;
        int val=2;
        while(val<=n)
        {
            int carry=0;
            for (int i=0;i<size;i++)
            {
                int temp = list.get(i)*val+carry;
                list.set(i,temp%10);
                carry=temp/10;
            }
            while(carry>0)
            {
                list.add(carry%10);
                carry=carry/10;
                size++;
            }
            val++;
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        System.out.println(findfact(n));
    }
}
