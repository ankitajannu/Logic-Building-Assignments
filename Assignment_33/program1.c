#include<stdio.h>

typedef unsigned int UINT;

int CountOne(UINT iNo)
{
    int iCnt = 0;
    
    while(iNo)
    {
        if(iNo & 1)
        {
            iCnt++;
        }
        iNo = iNo >> 1;
        }
    return iCnt;
}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = CountOne(iValue);

    printf("Number of 1 are : %d\n",iRet);
    return 0;
}