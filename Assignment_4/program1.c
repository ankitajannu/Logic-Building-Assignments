#include<stdio.h>

int MultFunc(int iNo)
{
    int iCnt = 0; 
    int iFact = 0;

    if(iNo < 0)
    {
        iNo =-iNo;
    }

    for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iFact = iFact * iCnt;
        }
    }
    return iFact;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    iRet = MultFunc(iValue);

    printf("%d",iRet);

    return 0;
}
