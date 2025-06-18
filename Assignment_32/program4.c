#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo, int iPos)
{
    UINT iMask = 1;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);
    iResult = iNo ^ iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0, iLocation = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    printf("Enter location : \n");
    scanf("%d",&iLocation);

    iRet = ToggleBit(iValue,iLocation);

    printf("Modified bit is : %d\n",iRet);

    return 0;
}