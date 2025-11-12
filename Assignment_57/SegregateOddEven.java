import java.io.*;

class SegregateOddEven
{
    static void segregateEvenOdd(int arr[])
    {
        int temp = 0,iLeft = 0, iRight = arr.length - 1;

        while(iLeft < iRight)
        {
            while((arr[iLeft] % 2) == 0 && iLeft < iRight)
            {
                iLeft++;
            }

            while((arr[iRight] % 2) == 1 && iLeft < iRight)
            {
                iRight--;
            }

            if(iLeft < iRight)
            {
                temp = arr[iLeft];
                arr[iLeft] = arr[iRight];
                arr[iRight] = temp;

                iLeft++;
                iRight--;
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {12,34,45,9,8,90,3};
        int i = 0;

        segregateEvenOdd(arr);

        System.out.println("Array after segregation : ");
        for(i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}