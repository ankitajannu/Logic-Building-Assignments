///////////////////////////////
//
// File name : program4.c
// Description : Used to display first number in second number of times
// Author : Ankita Ramesh Jannu
// Date : 11/05/2025
//
///////////////////////////////

#include<stdio.h>

void Display(int iNo, int iFrequency)
{
    int i = 0;

    for(i = 1; i <= iFrequency; i++)
    {
        printf("%d",iNo);
    }
}

int main()
{
    int iValue = 0;
    int iCount = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    printf("Enter frequency");
    scanf("%d",&iCount);

    Display(iValue, iCount);

    return 0;
}