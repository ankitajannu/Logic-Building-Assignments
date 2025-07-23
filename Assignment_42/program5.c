#include<stdio.h>

int Mult(int iNo)
{
    static int iMult = 1;

    if(iNo != 0)
    {
        iMult = iMult * (iNo % 10);
        iNo = iNo / 10;

        Mult(iNo);
    }
    return iMult;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    iRet = Mult(iValue);

    printf("%d",iRet);

    return 0;
}