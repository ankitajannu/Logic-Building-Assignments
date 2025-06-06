import java.util.*;

class Number
{
    public boolean CheckDivisible(int iNo)
    {
        if(((iNo % 3) == 0) && ((iNo % 5) == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program23
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.CheckDivisible(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" Is divisible by 3 and 5");
        }
        else
        {
            System.out.println(iValue+" Is not divisible by 3 and 5");
        }
    }
}