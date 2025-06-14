#include<stdio.h>

int CountChar(char *str, char ch)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if((*str == ch) || (*str == ch + 32) || (*str == ch - 32) || (*str == ch + 0))
        {
           iCount++;
        }
        str++;
    }
    return iCount;
}

int main()
{ 
    char arr[20] = {'\0'};
    char cValue = '\0';
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^'\n']s",arr);

    printf("Enter the character : \n");
    scanf(" %c",&cValue);

    iRet = CountChar(arr,cValue);

    printf("Character frequency is %d\n",iRet);

    return 0;
}