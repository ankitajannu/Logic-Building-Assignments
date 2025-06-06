import java.util.*;

class Display
{
    public void DisplayEvenFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)  // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if(((iNo % iCnt) == 0) && ((iCnt % 2) == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program37
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Display dobj = new Display();
        dobj.DisplayEvenFactors(iValue);
    }
}