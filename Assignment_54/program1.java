import java.util.*;

class MyArray
{
    public int Arr[];

    public MyArray(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter the array elements : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            this.Arr[iCnt] = sobj.nextInt();
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

    public void ReverseArray()
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            int iNo = Arr[iCnt];
            int iRev = 0;

            while(iNo != 0)
            {
                iRev = iRev * 10 + iNo % 10;
                iNo = iNo / 10;
            }

            Arr[iCnt] = iRev;
            System.out.print(Arr[iCnt]+"\t");
        }
    }
}

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();

        mobj.Display();

        mobj.ReverseArray();        
    }
}