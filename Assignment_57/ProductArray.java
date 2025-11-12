class ProductArray
{
    void productArray(int arr[], int n)
    {
        int i = 0, temp = 0;
        int prod[] = new int[n];

        temp = 1;
        for(i = 0; i < n; i++)
        {
            prod[i] = 1;
        }

        for(i = 0; i < n; i++)
        {
            prod[i] = temp;
            temp = temp * arr[i];
        }

        temp = 1;

        for(i = n-1; i >= 0; i--)
        {
            prod[i] = prod[i] * temp;
            temp = temp * arr[i];
        }

        for(i = 0; i < n; i++)
        {
            System.out.println(prod[i]+" ");
        }
    }

    public static void main(String A[])
    {
        ProductArray pa = new ProductArray();

        int arr[] = {10,3,5,6,2};

        int n = arr.length;

        System.out.println("Product array is : ");
        pa.productArray(arr,n);
    }
}