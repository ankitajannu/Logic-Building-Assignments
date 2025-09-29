import java.util.*;

class MyArray
{
    public float Arr[];

    public MyArray(int iSize)
    {
        Arr = new float[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter the array elements : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            this.Arr[iCnt] = sobj.nextFloat();
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

    public void Percentage()
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] < 35)
            {
                System.out.println(Arr[iCnt]+" : Fail");
            }
            else if(Arr[iCnt] < 50)
            {
                System.out.println(Arr[iCnt]+" : Pass Class");
            }
            else if(Arr[iCnt] < 60)
            {
                System.out.println(Arr[iCnt]+" : Second Class");
            }
            else if(Arr[iCnt] < 70)
            {
                System.out.println(Arr[iCnt]+" : First Class");
            }
            else if(Arr[iCnt] > 70)
            {
                System.out.println(Arr[iCnt]+" : First Class with Distinction");
            }
        }
    }
}

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();

        mobj.Display();

        mobj.Percentage();        
    }
}