#include<iostream>
using namespace std;

template <class T>
int Frequency(T *arr, int iSize, T iNo)
{
    int i = 0, iFreq = 0;

    if((arr == NULL) || (iSize <= 0))
    {
        return -1; 
    }

    for(i = 0; i < iSize; i++)
    {
        if(arr[i] == iNo)
        {
            iFreq++;
        }
    }
    return iFreq;
}

int main()
{
    int arr[] = {10,20,30,10,40,10,40,10};

    int iRet = Frequency(arr,9,10);

    cout<<iRet;

    return 0;
}