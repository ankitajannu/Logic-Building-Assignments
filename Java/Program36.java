import java.util.*;

class Display
{
    public void DisplayFactorsNonFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)  // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println("Factor is "+iCnt);
            }
            else
            {
                System.out.println("Non Factor is "+iCnt);
            }
        }
    }
}

class Program36
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Display dobj = new Display();
        dobj.DisplayFactorsNonFactors(iValue);
    }
}