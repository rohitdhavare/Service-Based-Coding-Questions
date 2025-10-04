public class P14
{
    public static void main(String[] args) {
        int n=4;

        for (int i=1;i<=n;i++)
        {
            for (int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int j=2;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }

        int m=7;

        for (int i=1;i<=n;i++)
        {
            for(int s=2;s<=i;s++)
            {
                System.out.print(" ");
            }

            for (int j=1;j<=n-i+1;j++)
            {
                System.out.print("*");
            }

            for (int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
