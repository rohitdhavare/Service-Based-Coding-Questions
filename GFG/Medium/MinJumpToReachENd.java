package GFG.Medium;

public class MinJumpToReachENd
{
    public static int findminjump(int[] arr)
    {
        int max_r = arr[0];
        int step = arr[0];
        int jump = 1;
        if (arr.length==1)
        {
            return 1;
        } else if (arr[0]==0) {
            return -1;
        }else {
            for (int i=1;i<arr.length;i++)
            {
                if (i==arr.length-1)
                {
                    return jump;
                }
                max_r = Math.max(max_r,1+arr[i]);
                step--;
                if (step==0)
                {
                    jump++;
                    if (i>=max_r)
                    {
                        return -1;
                    }
                    step = max_r-1;
                }
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(findminjump(arr));
    }
}
