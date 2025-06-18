#include<stdio.h>
#include<stdbool.h>

typedef unsigned int UINT;

bool ChkBit(UINT iNo, int iPos)
{
    UINT iMask = 1;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);
    iResult = iNo & iMask;

    return(iResult == iMask);
}

int main()
{
    UINT iValue = 0, iLocation = 0;
    bool bRet = false;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    printf("Enter location : \n");
    scanf("%d",&iLocation);

    bRet = ChkBit(iValue,iLocation);

    if(bRet == true)
    {
        printf("bit is ON at location\n",iLocation);
    }
    else
    {
        printf("bit is OFF at location\n",iLocation);
    }


    return 0;
}