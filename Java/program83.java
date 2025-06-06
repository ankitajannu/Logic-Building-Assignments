import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = -iNo; iCnt <= 0; iCnt++)   // N
        {
            System.out.print(iCnt+"\t");
        }
        for(iCnt = 1; iCnt <= iNo; iCnt++)   // N
        {
            System.out.print(iCnt+"\t");
        }
        System.out.println();
    }
}

class program83
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue);  
    }
}

// Time Complexity 0(2N)
// N is a natural number
// Where N >= 0 and N <= Infinity