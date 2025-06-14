#include<stdio.h>

void StrCpyCap(char *src, char *dest)
{
    if((src == NULL) || (dest == NULL))
    {
        printf("Invalid input");
    }

    while(*src != '\0')
    {
        if((*src >= 'A') && (*src <= 'Z'))
        {
            *dest = *src;
            dest++;
        }
        src++;
    }
    *dest = '\0';
}

int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30];

    printf("%s\n",arr);

    StrCpyCap(arr,brr);
    
    printf("%s",brr);

    return 0;
}