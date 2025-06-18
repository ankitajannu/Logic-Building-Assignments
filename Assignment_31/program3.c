#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0xffffffbf;   
    UINT iResult = 0;

    iMask = ~iMask;
    iResult = iNo ^ iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = ToggleBit(iValue);

    printf("Modified number is : %d\n",iRet);

    return 0;
}