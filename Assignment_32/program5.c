#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0x00000009;
    UINT iResult = 0;

    iMask = ~iMask;
    iResult = iNo & iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = ToggleBit(iValue);

    printf("Modified bit is : %d\n",iRet);

    return 0;
}