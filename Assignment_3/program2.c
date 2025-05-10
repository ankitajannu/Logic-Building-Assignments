//////////////////////////////////////////////////////////////////
//
// File name : program1.c
// Description : Used to print even factor of the given number
// Author : Ankita Ramesh Jannu
// Date : 11/05/2025
//
/////////////////////////////////////////////////////////////////

#include<stdio.h>

void DisplayFactor(int iNo)
{
    int i = 0;

    if(iNo <= 0)
    {
        iNo = -iNo;
    }

    for(i = 1; i <= iNo; i++)
    {
        if(iNo % i == 0)
        {
            printf("%d",i);
        }    
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    DisplayFactor(iValue);

    return 0;
}