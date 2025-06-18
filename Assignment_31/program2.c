#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo)
{
    UINT iMask = 0xfffffdbf;   
    UINT iResult = 0;

    iResult = iNo & iMask;
}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = OffBit(iValue);

    printf("Modified number is : %d\n",iRet);

    return 0;
}