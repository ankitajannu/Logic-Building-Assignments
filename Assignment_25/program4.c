#include<stdio.h>

void DisplayDigit(char *str)
{
    int iCount = 0;
    while(*str != '\0')
    {
        if((*str >= '0') && (*str <= '9'))
        {
            iCount++;
        }
        
        str++;
    }
    printf("%s",str);
}

int main()
{
    char arr[20];

    printf("Enter string : \n");
    scanf("%[^'\n']s",arr);

    DisplayDigit(arr);
                                                                                                                                                                                                                                                              
    return 0;
}