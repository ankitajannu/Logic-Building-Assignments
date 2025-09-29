import java.util.*;

class MyArray
{
    public char Arr[];

    public MyArray(int iSize)
    {
        Arr = new char[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter the array elements : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            this.Arr[iCnt] = sobj.nextLine().charAt(0);
        }
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of the array are : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            System.out.print(this.Arr[iCnt]+"\t");
        }
        System.out.println();
    }

    public int Search()
    {
        Scanner sobj = new Scanner(System.in);

        int iCount = 0, i = 0;
        char ch = '\0';
    
        System.out.println("Enter the character that you want to search : ");
        ch = sobj.nextLine().charAt(0);

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] == ch) || (Arr[i] == ch - 32) || (Arr[i] == ch + 32))
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;
        char str = '\0';

        System.out.println("Enter the number of characters : ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();

        mobj.Display();

        iRet = mobj.Search();  

        System.out.println("Frequency of that character is : "+iRet);
    }
}