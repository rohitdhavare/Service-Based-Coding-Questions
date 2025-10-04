package GFG.Easy;
public class WaveArray
{
    public static int findSoln(int[] arr)
    {
        int count=0;
        int ans =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }else {
                ans=Math.max(ans,count);
                count=0;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
     int[] arr = {1,2,1,1,3,4,1,1,1,5,6};
        System.out.println(findSoln(arr));
    }
}