import java.util.*;

class Calculate
{
    public int Summation(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        return iSum;
    }
}

class Program18
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Calculate cobj = new Calculate();
        iRet = cobj.Summation(iValue);

        System.out.println("Summation is : "+iRet);
    }
}