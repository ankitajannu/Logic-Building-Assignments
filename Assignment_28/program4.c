#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<fcntl.h>
#include<string.h>

int main()
{
    int fd = 0, iRet = 0;
    char Fname[20] = {'\0'};
    char Buffer[50] = "India is my country";

    printf("Enter the file name : \n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);

    if(fd == -1)
    {
        printf("Unable to open file");
        return -1;
    }
    else
    {
        printf("File opened successfully\n",fd);

        iRet = write(fd,Buffer,strlen(Buffer));

        printf("File size is %d bytes\n",iRet);

        close(fd);
    }
    
    return 0;
}