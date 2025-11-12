class PythagoreanTriplet
{
    static boolean isTriplet(int arr[], int n)
    {
        int i = 0, iLeft = 0, iRight = 0;

        for(i = 0; i < n; i++)
        {
            arr[i] = arr[i] * arr[i];
        }

        for(i = n-1; i >= 2; i--)
        {
            iRight = i - 1;

            while(iLeft < iRight)
            {
                if(arr[iLeft] + arr[iRight] == arr[i])
                {
                    return true;
                }

                if(arr[iLeft] + arr[iRight] < arr[i])
                {
                    iLeft++;
                }
                else
                {
                    iRight--;
                }
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        int arr[] = {10,4,6,12,5};
        int arr_size = arr.length;

        if(isTriplet(arr,arr_size) == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}