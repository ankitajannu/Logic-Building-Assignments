#include<stdio.h>

void Display(char ch)
{
    int i = 0;

    for(i = 1; i <= ch; i++)
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {
           printf("%c\t",ch);
           ch++;
        }
        if((ch >= 'a') && (ch <= 'z'))
        {
           printf("%c\t",ch);
           ch--;
        }
    }  
}

int main()
{
    char cValue = '\0';

    printf("Enter the character : \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}