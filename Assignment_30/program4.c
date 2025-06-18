#include<stdio.h>
#include<stdbool.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo, int iPos1, int iPos2)  
{
    UINT iMask = 0x000001c0;  
    UINT iResult = 0;

    iMask1 = iMask1 << (iPos1 -1);
    iMask2 = iMask2 << (iPos2 -1);

    iMask1 = ~iMask1;
    iMask2 = ~iMask2;

    iResult = iNo & iMask;

    return(iResult == iMask);
}

int main()
{
    UINT iValue = 0;
    BOOL bRet = FALSE;
    
    printf("Enter number : \n");
    scanf("%d",&iValue);

    bRet = ChkBit(iValue);

    if(bRet == TRUE)
    {
        printf("7th,8th and 9th bit is ON\n");
    }
    else
    {
        printf("7th,8th and 9th bit is OFF\n");
    }

    return 0;
}