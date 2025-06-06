import java.util.*;

class Check
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = true;

        if(iNo < 0)  // Updater
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;
    }
}

class Program40
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Check cobj = new Check();
        bRet = cobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Prime number");
        }
        else
        {
            System.out.println(iValue+" is not a Prime number");
        }
    }
}