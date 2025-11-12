import java.util.*;

public class Pattern1
{
    public void Pattern(int row, int col)
    {
        int i = 0, j = 0;

        for(i = row; i >= 1; i--)
        {
            for(j = 1; j <= col; j++)
            {
                if(i >= j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }

            for(j = 1; j <= col; j++)
            {
                if(i >= j)
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }

        for(i = 1; i <= row; i++)
        {
            for(j = 1; j <= col; j++)
            {
                if(i >= j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }

            for(j = 1; j <= col; j++)
            {
                if(i >= j)
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sc.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sc.nextInt();

        Pattern1 pobj = new Pattern1();

        pobj.Pattern(iValue1,iValue2);
    }
}