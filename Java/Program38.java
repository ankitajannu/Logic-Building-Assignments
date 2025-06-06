import java.util.*;

class Calculate
{
    public int SumFactors(int iNo)
    {
        int iCnt = 0, iSum = 0;

        if(iNo < 0)  // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}

class Program38
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Calculate cobj = new Calculate();
        iRet = cobj.SumFactors(iValue);

        System.out.println("Addition is "+iRet);
    }
}