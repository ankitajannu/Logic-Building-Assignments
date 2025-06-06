import java.util.*;

class Digits
{
    public int SumDigits(int iNo)
    {
        int iSum = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10; 
        }
        return iSum;
    }
}

class Program50
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;
        
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.SumDigits(iValue);

        System.out.println("Summation of digits are "+iRet);
    }
}