////////////////////////////////////////
//
// File name : program4.c
// Description : Used to convert case 
// Author : Ankita Ramesh Jannu
// Date : 11/05/2025
//
////////////////////////////////////////

#include<stdio.h>

void DisplayConvert(char cValue)
{
    if(islower(cValue))
    {
        cValue = toupper(cValue);
        printf("%c",cValue);
    }
    else if(isupper(cValue))
    {
        cValue = tolower(cValue);
        printf("%c",cValue);           
    }
    return 0;
}

int main()
{
    char cValue = '\0';

    printf("Enter character\n");
    scanf("%c",&cValue);

    DisplayConvert(cValue);

    return 0;
}