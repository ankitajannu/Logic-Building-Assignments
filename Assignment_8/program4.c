#include<stdio.h>

double FhtoCs(float fTemp)
{
    float fCel = 0.0f;

    fCel = (fTemp - 32) * (5.0 / 9.0);

    return fCel;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter temperature in Fahrenheit");
    scanf("%f",&fValue);

    dRet = FhtoCs(fValue);

    printf("Temperature in celcius  is %.4lf",dRet);

    return 0;
}