///////////////////////////////
//
// File name : program3.c
// Description : Used to print Hello if number is less than 10 or print Demo
// Author : Ankita Ramesh Jannu
// Date : 11/05/2025
//
///////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    if(iNo < 10)
    {
        printf("Hello");
    }
    else
    {
        printf("Demo");
    }
}

int main()
{
    int iValue = 0;
    printf("Enter number");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}