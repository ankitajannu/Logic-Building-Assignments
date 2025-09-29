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

    public boolean CheckPallindrome()
    {
        int start = 0;
        int end = Arr.length - 1;

        while(start < end)
        {
            if(Arr[start] != Arr[end])
            {
                return false;
            }

            start++;
            end--;
        }
        
        if(start < end)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter the number of elements : ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();

        mobj.Display();

        bRet = mobj.CheckPallindrome();

        if(bRet == true)
        {
            System.out.println("Array is Pallindrome");
        }
        else 
        {
            System.out.println("Array is not Pallindrome");
        }
    }
}