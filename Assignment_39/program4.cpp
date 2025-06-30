#include<iostream>
using namespace std;

template <class T>
int SearchLast(T *arr, int iSize, T iNo)
{
    int i = 0;

    for(i = iSize - 1; i > 0; i--)
    {
        if(arr[i] == iNo)
        {
            break;
        }
    }

    if(i == iSize)
    {
        return -1;
    }
    else
    {
        return i + 1;
    }
}

int main()
{
    int arr[] = {10,20,30,10,40,10,40,10};

    int iRet = SearchLast(arr,9,40);

    cout<<iRet;

    return 0;
}