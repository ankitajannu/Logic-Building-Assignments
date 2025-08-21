// Accept number of rows and columns from user and display below patterns
// Input : iRow : 6, iCol : 6

/* Output : 
    *   *   *   *   *   *
    *   #   #   #   *   *
    *   #   #   *   $   *
    *   #   *   $   $   *   
    *   *   $   $   $   *   
    *   *   *   *   *   *
*/

import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = iRow; i >= 1; i--)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((j == 1) || (j == iCol) || (i == 1) || (i == iRow))
                {
                    System.out.print("*\t");
                }
                else if(i < j)
                {
                    System.out.print("$\t");
                }
                else if(i > j)
                {
                    System.out.print("#\t");
                }
                else if(i == j)
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Pattern(iValue1,iValue2);
    }
}