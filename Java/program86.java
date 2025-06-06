import java.util.*;

class Pattern
{
    public void Display(int iNo, char ch)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)   // N
        {
            System.out.print(ch+"\t");
        }
        System.out.println();
    }
}

class program86
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        char cValue = '\0';

        System.out.println("Enter frequency : ");
        iValue = sobj.nextInt();

        System.out.println("Enter character : ");
        cValue = sobj.nextChar();
        
        System.out.println("Accepted character is :"+cValue);

        Pattern pobj = new Pattern();

        pobj.Display(iValue,cValue);  
    }
}

// Time Complexity 0(N)
// N is a natural number
// Where N >= 0 and N <= Infinity