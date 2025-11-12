import java.util.*;

class MaximumDifference
{
    public int maxDiff(int arr[], int arr_size)
    {
        int i = 0, diff = 0, iMin = 0, iMax = 0;

        iMax = arr[1] - arr[0];
        iMin = arr[0];

        for(i = 1; i < arr_size; i++)
        {
            diff = arr[i] - iMin;

            if(diff > iMax)
            {
                iMax = diff;
            }

            if(arr[i] < iMin)
            {
                iMin = arr[i];
            }
        }

        return iMax;
    }

    public static void main(String[] args)
    {
        MaximumDifference maxdif = new MaximumDifference();

        int arr[] = {1,2,90,10,110};

        System.out.println("Maximum Difference is : "+maxdif.maxDiff(arr,5));
    }
}