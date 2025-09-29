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

    public int[] CopyArrayRev()
    {
        int iCnt = 0;
        int NewArray[] = new int[Arr.length];

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            NewArray[iCnt] = Arr[Arr.length - 1 - iCnt];
        }

        return NewArray;
    }
}

class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();

        mobj.Display();

        int[] iRet = mobj.CopyArrayRev();
        System.out.println("Copied Array : "+Arrays.toString(iRet));
    }
}