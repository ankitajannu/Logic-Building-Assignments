#include<stdio.h>

double CircleArea(float fRadius)
{
    float fArea = 0.0f, fPI = 3.14f;

    fArea = fPI * fRadius *fRadius;

    return fArea;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter radius");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf("Area of circle is %.4lf",dRet);

    return 0;
}