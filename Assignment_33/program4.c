#include<stdio.h>
#include<stdbool.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo, int iPos1, int iPos2)  
{
    UINT iMask = 1;
    UINT iMask1 = 1;
    UINT iMask2 = 1;   
    UINT iResult = 0;

    iMask1 = iMask1 << (iPos1 - 1);
    iMask2 = iMask2 << (iPos2 - 1);

    iMask = iMask1 & iMask2;
    iResult = iNo & iMask;

    return(iResult == iMask);
}

int main()
{
    UINT iValue = 0, iLocation1 = 0, iLocation2 = 0;
    BOOL bRet = FALSE;
    
    printf("Enter number : \n");
    scanf("%d",&iValue);

    printf("Enter first position : \n");
    scanf("%d",&iLocation1);

    printf("Enter second position : \n");
    scanf("%d",&iLocation2);

    bRet = ChkBit(iValue,iLocation1,iLocation2);

    if(bRet == TRUE)
    {
        printf("bit is ON\n");
    }
    else
    {
        printf("bit is OFF\n");
    }

    return 0;
}