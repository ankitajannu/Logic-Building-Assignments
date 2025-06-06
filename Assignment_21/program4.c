#include<stdio.h>
#include<stdlib.h>

void Digits(int Arr[], int iLength)
{
    int i = 0;

    if((Arr == NULL) || (iLength <= 0))
    {
        printf("Invalid input");
    }

    for(i = 0; i < iLength; i++)
    {
        if((Arr[i] >= 100 ) && (Arr[i] <= 999))
        {
            printf("%d\t",Arr[i]);
        }  
    } 
}

int main()
{
    int iSize = 0, iCnt = 0;
    int *p = NULL;

    printf("Enter number of elelments : ");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unalbe to allocate memory");
        return -1;
    }

    printf("Enter %d elements : ",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("\nEnter element %d : ",iCnt + 1);
        scanf("%d",&p[iCnt]);
    }

    Digits(p,iSize);

    free(p);

    return 0;
}