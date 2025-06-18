#include<stdio.h>
#include<stdbool.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)  
{
    UINT iMask = 0x80000001;   
    UINT iResult = 0;

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
        printf("1st and 32th bit is ON\n");
    }
    else
    {
        printf("1st and 32th bit is OFF\n");
    }

    return 0;
}