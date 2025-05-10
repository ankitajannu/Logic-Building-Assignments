///////////////////////////////
//
// File name : program1.c
// Description : Used to print * on screen
// Author : Ankita Ramesh Jannu
// Date : 11/05/2025
//
///////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    iCnt = 1;
    while(iCnt < iNo)
    {
        printf(" * ");
        iCnt++;        
    }
}

int main()
{
    int iValue = 0;

    printf("Enter Number");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}