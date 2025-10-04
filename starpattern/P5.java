public class P5
{
    public static void main(String[] args) {
        int n = 5;

        for (int i=1;i<=n;i++){
            //To Space

            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            // To print star
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
