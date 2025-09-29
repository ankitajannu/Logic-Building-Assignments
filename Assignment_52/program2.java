import java.util.*;

class MyArray
{
    public int Arr1[];
    public int Arr2[];

    public MyArray(int iSize1, int iSize2)
    {
        Arr1 = new int[iSize1];
        Arr2 = new int[iSize2];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter the elements for first array : ");
        for(iCnt = 0; iCnt < this.Arr1.length; iCnt++)
        {
            this.Arr1[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the elements for second array : ");
        for(iCnt = 0; iCnt < this.Arr2.length; iCnt++)
        {
            this.Arr2[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of the first and second array are : ");
        for(iCnt = 0; iCnt < this.Arr1.length; iCnt++)
        {
            System.out.print(this.Arr1[iCnt]+"\t");
        }

        System.out.println();

        for(iCnt = 0; iCnt < this.Arr2.length; iCnt++)
        {
            System.out.print(this.Arr2[iCnt]+"\t");
        }

        System.out.println();
    }

    public void DisplayEven()
    {
        int iCnt = 0;

        System.out.println("Even elements of the first and second array are : ");
        for(iCnt = 0; iCnt < Arr1.length; iCnt++)
        {
            if((Arr1[iCnt] % 2) == 0)
            {
                System.out.print(Arr1[iCnt]+"\t");
            }
        }

        System.out.println();

        for(iCnt = 0; iCnt < Arr2.length; iCnt++)
        {
            if((Arr2[iCnt] % 2) == 0)
            {
                System.out.print(Arr2[iCnt]+"\t");
            }
        }        
    }
}

class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int iSize1 = sobj.nextInt();

        System.out.println("Enter the number of elements : ");
        int iSize2 = sobj.nextInt();

        MyArray mobj = new MyArray(iSize1, iSize2);

        mobj.Accept();

        mobj.Display();

        mobj.DisplayEven();
    }
}