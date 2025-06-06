import java.util.*;

class Digits
{
    public int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iCnt++;
        }
        return iCnt;
    }
}

class Program47
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;
        
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.CountDigits(iValue);

        System.out.println("Number of digits are "+iRet);
    }
}