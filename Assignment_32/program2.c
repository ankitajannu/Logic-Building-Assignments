#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo, int iPos)
{
    UINT iMask = 1;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);
    iMask = ~iMask;
    iResult = iNo & iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0, iLocation = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    printf("Enter location : \n");
    scanf("%d",&iLocation);

    iRet = OffBit(iValue,iLocation);

    printf("Modified bit is : %d\n",iRet);

    return 0;
}