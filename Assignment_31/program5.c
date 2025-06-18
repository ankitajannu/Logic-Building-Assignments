#include<stdio.h>

typedef unsigned int UINT;

UINT OnBit(UINT iNo)
{
    UINT iMask = 0xfffffff8;   
    UINT iResult = 0;
    
    iMask = ~iMask;
    iResult = iNo | iMask;   
}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = OnBit(iValue);

    printf("Modified number is : %d\n",iRet);

    return 0;
}