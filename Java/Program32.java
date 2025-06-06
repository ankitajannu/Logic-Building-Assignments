import java.util.*;

class Calculate
{
    public unsigned long Factorial(unsigned int iNo)
    {
        int iCnt = 0;
        unsigned long iFact = 1;
        
        if(iNo < 0)
        {
            return -1;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact + iCnt;
        }
        return iFact;
    }
}

class Program32
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        unsigned int iValue = 0;
        unsigned long iRet = 0;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Calculate cobj = new Calculate();
        iRet = cobj.Factorial(iValue);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Factorial is "+iRet);
        }
        
    }
}