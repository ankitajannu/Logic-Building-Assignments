#include<stdio.h>

int WhiteSpace(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }
        str++;

        WhiteSpace(str);
    }

    return iCount;
}
int main()
{
    int iRet = 0;
    char arr[50] = {'\0'};

    printf("Enter the string : \n");
    scanf("%[^'\n']s",arr);

    iRet = WhiteSpace(arr);

    printf("%d\n",iRet);

    return 0;
}