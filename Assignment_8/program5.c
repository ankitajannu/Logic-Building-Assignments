#include<stdio.h>

double SquareMeter(int iValue)
{
    float fSqMeter = 0.0f;

    fSqMeter = iValue * 0.0929;

    return fSqMeter;
}

int main()
{
    int iValue = 0.0f;
    double dRet = 0.0;

    printf("Enter area in square feet");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf("Area in square meter is %lf",dRet);

    return 0;
}