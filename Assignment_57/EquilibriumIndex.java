class EquilibriumIndex
{
    int equilibrium(int arr[], int n)
    {
        int i = 0, iTotalSum = 0, iLeftSum = 0;

        for(i = 0; i < n;  i++)
        {
            iTotalSum = iTotalSum + arr[i];
        }

        for(i = 0; i < n; i++)
        {
            iTotalSum = iTotalSum - arr[i];

            if(iLeftSum == iTotalSum)
            {
                return i;
            }

            iLeftSum = iLeftSum + arr[i];
        }

        return -1;
    }

    public static void main(String[] args)
    {
        EquilibriumIndex equi = new EquilibriumIndex();

        int arr[] = {-7,1,5,2,-4,3,0};
        int arr_size = arr.length;

        System.out.println("First equilibrium index is : "+equi.equilibrium(arr,arr_size));
    }
}