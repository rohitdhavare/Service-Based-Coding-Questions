/*

****
***
**
*

 */
public class P4
{
    public static void main(String[] args) {
        int n = 4;
        int m = 4;

        for(int i = 1;i<=n;i++)
        {
            for(int j=m;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
