import java.util.*;

class Digits
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(+iDigit);
            iNo = iNo / 10;
        }
    }
}

class Program46
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        dobj.DisplayDigits(iValue);
    }
}