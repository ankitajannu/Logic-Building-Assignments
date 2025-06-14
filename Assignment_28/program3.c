#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<fcntl.h>
#include<string.h>

int main()
{
    int fd = 0, iRet = 0;
    char Fname[20] = {'\0'};
    char Buffer[] = "India is my country";

    printf("Enter the file name : \n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file");
        return -1;
    }
    else
    {
        printf("File opened successfully\n",fd);

        iRet = read(fd,Buffer,strlen(Buffer));

        printf("Data from file is : %s\n",Buffer);

        close(fd);
    }
    
    return 0;
}