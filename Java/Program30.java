import java.util.*;

class Calculate
{
    public int Factorial(int iNo)
    {
        int i = 0, iFact = 1;

        for(i = 1; i <= iNo; i++)
        {
            iFact = iFact + i;
        }
        return iFact;
    }
}

class Program30
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