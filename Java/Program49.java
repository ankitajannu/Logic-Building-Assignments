import java.util.*;

class Digits
{
    public int CountEvenDigits(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iCnt++;
            }
            iNo = iNo / 10; 
        }
        return iCnt;
    }
}

class Program49
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;
        
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.CountEvenDigits(iValue);

        System.out.println("Number of digits are "+iRet);
    }
}