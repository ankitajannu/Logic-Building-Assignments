import java.util.*;

class Number
{
    public boolean CheckEven(int iNo)
    {
        boolean bResult = false;

        if((iNo % 2) == 0)
        {
            bResult = true;
        }
        else
        {
            bResult =  false;
        }
        return bResult;
    }
}

class Program20
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the value : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.CheckEven(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" Is even number");
        }
        else
        {
            System.out.println(iValue+" Is odd number");
        }
    }
}