#include<stdio.h>

int Min(int iNo)
{
    static int iDigit = 0;
    static int iMin = 9;

    if(iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit < iMin)
        {
            iMin = iDigit;
        }
        iNo = iNo / 10;

        Min(iNo);
    }

    return iMin;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    iRet = Min(iValue);

    printf("%d\n",iRet);

    return 0;
}