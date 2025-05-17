#include<stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0, iSum1 = 0, iSum2 = 0;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iSum1 = iSum1 + iCnt;
        }
        else
        {
            iSum2 = iSum2 + iCnt;
        }
    }
    int differnce = iSum1 -iSum2;
    printf("Difference between summation of factors and nonfactors is : %d\n");
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("%d",iRet);

    return 0;
}