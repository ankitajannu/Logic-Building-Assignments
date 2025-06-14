#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>
#include<fcntl.h>

#define BUFFER_SIZE 1024

int CountCapital(char Fname[])
{
    int fd = 0, iCnt = 0, iCountCap = 0, iFile = 0;
    char Buffer[BUFFER_SIZE] = {'\0'};
    
    fd = open(Fname, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to pen file");
        return -1;
    }
    else
    {
        printf("File is successfully opened with fd : %d\n",fd);

        while((iFile = read(fd,Buffer,BUFFER_SIZE)) != 0)
        {
            for(iCnt = 0; iCnt < iFile; iCnt++)
            {
                if((Buffer[iCnt] >= 'A') && (Buffer[iCnt] <= 'Z'))
                {
                    iCountCap++;
                }
            }
            memset(Buffer,'\0',BUFFER_SIZE);
        }
        close(fd);
        return iCountCap;
    }
}

int main()
{
    char FileName[30] = {'\0'};
    int iRet = 0;

    printf("Enter the file name : \n");
    scanf("%s",FileName);

    iRet = CountCapital(FileName);

    printf("Number of Capital Characters are : %d",iRet);

    return 0;
}