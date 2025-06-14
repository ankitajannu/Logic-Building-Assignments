#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>
#include<fcntl.h>

#define BUFFER_SIZE 1024

void DisplayN(char Fname[], int iSize)
{
    int fd = 0, iRet = 0;
    char Buffer[BUFFER_SIZE] = "India Is My Country";
    
    fd = open(Fname, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file");
    }
    else
    {
        printf("File is successfully opened with fd : %d\n",fd);

        iRet = read(fd,Buffer,strlen(Buffer));

        printf("%d bytes gets reads successfully\n",iRet);

        printf("Data from the file is : %s\n",Buffer);

        close(fd);
    }        
}

int main()
{
    char FileName[30] = {'\0'};
    int iValue = 0;

    printf("Enter the file name : \n");
    scanf("%s",FileName);

    printf("Enter the number of character : \n");
    scanf("%d",&iValue);

    DisplayN(FileName,iValue);

    return 0;
}