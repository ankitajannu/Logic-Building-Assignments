#include<iostream>
using namespace std;

template <class T>
T Min(T *arr, int iSize)
{
    T iMin = 0;
    int i = 0;

    if(arr == NULL)
    {
        return -1;
    }

    iMin = arr[0];

    for(i = 0; i < iSize; i++)
    {
        if(arr[i] < iMin)
        {
            iMin = arr[i];
        }
    }
    return iMin;
}

int main()
{
    int arr[] = {10,20,30,40,50};

    float brr[] = {10.3,3.7,9.8,8.7};

    int iRet = Min(arr,5);
    cout<<iRet<<"\n";

    float fRet = Min(brr,4);
    cout<<fRet<<"\n";

    return 0;
}