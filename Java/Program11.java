import java.util.*;

class Calculate
{
    public void Display()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 4; iCnt++)
        {
            System.out.println("Hello");
        }
    }
}

class Program11
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Calculate cobj = new Calculate();

        cobj.Display();
    }
}