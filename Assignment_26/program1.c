#include<stdio.h>
#include<stdbool.h>

bool ChkChar(char *str, char ch)
{
    bool bFlag = false;
    
    while(*str != '\0')
    {
        if(*str == ch)
        {
            bFlag = true;
            break;
        }
        str++;
    }
    return bFlag;
}

int main()
{ 
    char arr[20];
    char cValue = '\0';
    bool bRet = false;

    printf("Enter string : \n");
    scanf("%[^'\n']s",arr);

    printf("Enter the character : ");
    scanf(" %c",&cValue);

    bRet = ChkChar(arr,cValue);

    if(bRet == true)
    {
        printf("Character found",arr);
    } 
    else
    {
        printf("Character not found",arr);
    }

    return 0;
}