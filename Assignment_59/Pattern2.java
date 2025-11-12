import java.util.*;

public class Pattern2
{
    public void Pattern(int row)
    {
        int i = 0, j = 0;

        for(i = row; i >= 1; i--)
        {
            for(j = 1; j <= row + i - 1; j++)
            {
                if(j <= row - i)   
                {
                    System.out.print(" ");
                }
                else if((j - (row - i)) % 2 == 1)  
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of rows : ");
        iValue = sc.nextInt();

        Pattern2 pobj = new Pattern2();

        pobj.Pattern(iValue);
    }
}