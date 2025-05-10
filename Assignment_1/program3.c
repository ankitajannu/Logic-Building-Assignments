///////////////////////////////
//
// File name : program3.c
// Description : Used to print 5 to 1 numbers 
// Author : Ankita Ramesh Jannu
// Date : 11/05/2025
//
///////////////////////////////

#include<stdio.h>

void Display()
{
    int i = 0;
    i = 5;
    while(i >= 1 )
    {
        printf("%d",i);
        i--;
    }
}

int main()
{
    Display();

    return 0;
}