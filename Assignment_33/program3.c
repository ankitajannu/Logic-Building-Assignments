#include<stdio.h>
#include<stdbool.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)  
{
    UINT iMask = 0;
    UINT iMask1 = 0x00000100;
    UINT iMask2 = 0x00000800;   
    UINT iResult = 0;

    iMask = iMask1 & iMask2;
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
        printf("9th and 12th bit is ON\n");
    }
    else
    {
        printf("9th and 12th bit is OFF\n");
    }

    return 0;
}