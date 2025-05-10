/////////////////////////////////////////////////////////////////////////////////////
//
// File name : program1.c
// Description : Used to accept one number and print that number of even numbers
// Author : Ankita Ramesh Jannu
// Date : 11/05/2025
//
/////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void PrintEven(int iNo)
{
    int i = 0;
    if(iNo <= 0)
    {
        return;
    }
    
    for(i = 1; i <= iNo; i++)
    {
        printf("%d",2 * i);
    }
}
    
int main()
{
    int iValue = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    PrintEven(iValue);

    return 0;
}