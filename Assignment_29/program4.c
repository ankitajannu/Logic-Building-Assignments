#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>
#include<fcntl.h>

#define BUFFER_SIZE 1024

int CountChar(char Fname[], char Ch)
{
    int fd = 0, iCnt = 0, iCount = 0, iFile = 0;
    char Buffer[BUFFER_SIZE] = {'\0'};
    
    fd = open(Fname, O_RDONLY);

    if(fd == -1)
    {
        return -1;
    }
    else
    {
        printf("File is successfully opened with fd : %d\n",fd);

        while((iFile = read(fd,Buffer,BUFFER_SIZE)) != 0)
        {
            for(iCnt = 0; iCnt < iFile; iCnt++)
            {
                if(Buffer[iCnt] == Ch)
                {
                    iCount++;
                }
            }
            memset(Buffer,'\0',BUFFER_SIZE);
        }
        return iCount;

        close(fd);
    }

}

int main()
{
    char FileName[30] = {'\0'};
    int iRet = 0;
    char cValue = '\0';

    printf("Enter the file name : \n");
    scanf("%s",FileName);

    printf("Enter the character : \n");
    scanf(" %c",&cValue);

    iRet = CountChar(FileName,cValue);

    printf("Frequency is : %d",iRet);

    return 0;
}