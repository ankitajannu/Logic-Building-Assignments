import java.util.*;

class Program45
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 751;
        int iDigit = 0;

        iDigit = iNo % 10;
        System.out.println("Digit is "+iDigit);
        iNo = iNo / 10;
        System.out.println("Updated iNo "+iNo);

        iDigit = iNo % 10;
        System.out.println("Digit is "+iDigit);
        iNo = iNo / 10;
        System.out.println("Updated iNo "+iNo);

        iDigit = iNo % 10;
        System.out.println("Digit is "+iDigit);
        iNo = iNo / 10;
        System.out.println("Updated iNo "+iNo);
    }
}