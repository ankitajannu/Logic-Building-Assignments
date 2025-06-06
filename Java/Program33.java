import java.util.*;

class Display
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program33
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Display dobj = new Display();
        dobj.DisplayFactors(iValue);
    }
}