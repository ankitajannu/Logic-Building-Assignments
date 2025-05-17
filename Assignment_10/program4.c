#include<stdio.h>

int MultDigits(int iNo)
{
    int iProduct = 1, iDigit = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 0)
        {
            iProduct = 0;
            iProduct++;
        }
        iProduct = iProduct * iDigit;
        iNo = iNo / 10;
    }
    return iProduct;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    iRet = MultDigits(iValue);
    printf("%d",iRet);

    return 0;
}