#include<stdio.h>

int Small(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            iCount++;
        }
        str++;

        Small(str);
    }

    return iCount;
}
int main()
{
    int iRet = 0;
    char arr[50] = {'\0'};

    printf("Enter the string : \n");
    scanf("%[^'\n']s",arr);

    iRet = Small(arr);

    printf("%d\n",iRet);

    return 0;
}