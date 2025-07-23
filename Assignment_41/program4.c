#include<stdio.h>

void Display(int iNo)
{
    static int iCnt = 1;
    static char ch = 'A';

    if(iCnt <= iNo)
    {
        printf("%c\t",ch);
        iCnt++;
        ch++;

        Display(iNo);
    }
}

int main()
{
    int iValue = 0;

    printf("enter the number : \n");
    scanf("%d",&iValue);
    
    Display(iValue);

    return 0;
}