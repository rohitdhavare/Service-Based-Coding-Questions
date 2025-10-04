package GFG.Easy;

public class MoveAllZerosEnd
{
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        int insertposition = 0;

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]!=0)
            {
                arr[insertposition]=arr[i];
                insertposition++;
            }
        }
        while (insertposition<arr.length)
        {
            arr[insertposition++]=0;
        }

        for (int j:arr)
        {
            System.out.print(j+" ");
        }
    }
}
