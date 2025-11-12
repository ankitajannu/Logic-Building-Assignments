import java.util.*;

public class AddMatrices
{
    public static void main(String args[])
    {
        int row = 0, col = 0, i = 0, j = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        row = sc.nextInt();

        System.out.println("Enter number of columns : ");
        col = sc.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int sum[][] = new int[row][col];

        System.out.println("Enter elements of first matrix : ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix : ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of matrices : ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}