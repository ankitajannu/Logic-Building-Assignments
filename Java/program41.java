import java.util.*;

class Check
{
    public boolean CheckPerfect(int iNo)
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
        
        if(iNo == iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program41
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Check cobj = new Check();
        bRet = cobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Perfect number");
        }
        else
        {
            System.out.println(iValue+" is not a Perfect number");
        }
    }
}