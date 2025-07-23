#include<stdio.h>

int Max(int iNo)
{
    static int iDigit = 0;
    static int iMax = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit > iMax)
        {
            iMax = iDigit;
        }
        iNo = iNo / 10;

        Max(iNo);
    }

    return iMax;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    iRet = Max(iValue);

    printf("%d\n",iRet);

    return 0;
}