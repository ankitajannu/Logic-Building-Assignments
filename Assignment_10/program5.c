#include<stdio.h>

int CountDiff(int iNo)
{
       
    int iDigit = 0, iCnt = 0;
    int iSum1 = 0, iSum2 = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if((iDigit % 2) == 0)
        {
            iSum1 = +iDigit;
        }
        else
        {
            iSum2 = +iDigit;
        }
        iNo = iNo / 10;
    }
    int iDiff = iSum1 - iSum2;
    printf("%d",iDiff);
}    

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);
    printf("%d",iRet);

    return 0;
}