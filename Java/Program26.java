import java.util.*;

class Calculate
{
    public int Factorial(int iNo)
    {
        int iCnt = 0, iFact = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact + iCnt;
        }
        return iFact;
    }
}

class Program26
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Calculate cobj = new Calculate();
        iRet = cobj.Factorial(iValue);

        System.out.println("Factorial is"+iRet);
        
    }
}