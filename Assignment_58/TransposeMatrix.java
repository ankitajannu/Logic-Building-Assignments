import java.util.*;

public class TransposeMatrix
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

        System.out.println("Enter elements of matrix a : ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print("Element[" +(i+1)+","+(j+1)+"]?");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix a: ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println(":::Transpose Matrix :::");
        for(i = 0; i < col; i++)
        {
            for(j = 0; j < row; j++)
            {
                System.out.print(a[j][i]+"\t");
            }
            System.out.println();
        }
    }
}