import java.util.*;

class Calculate
{
    public int CalcualteTicket(int iAge)
    {
        if(iAge < 0)
        {
            return -1;
        }

        if((iAge >= 0) && (iAge <= 5))
        {
            return 0;
        }
        else if((iAge > 5) && (iAge <= 18))
        {
            return 700;
        }
        else if((iAge > 18) && (iAge <= 50))
        {
            return 999;
        }
        else if(iAge > 50)
        {
            return 500;
        }
    }
}

class Program8
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Please enter your age : ");
        iValue = sobj.nextInt();

        Calculate dobj = new Calculate();
        iRet = dobj.CalcualteTicket(iValue);

        System.out.println("Yout ticket price is : "+iRet);
    }
}