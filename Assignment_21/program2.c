#include<stdio.h>
#include<stdlib.h>

int Minimum(int Arr[], int iLength)
{
    int i = 0, iMin = 0;

    if((Arr == NULL) || (iLength <= 0))
    {
        printf("Invalid input");
        return -1;
    }

    iMin = Arr[0];

    for(i = 0; i < iLength; i++)
    {
        if(Arr[i] < iMin)
        {
            iMin = Arr[i];
        }
    }
    return iMin;
}

int main()
{
    int iSize = 0, iCnt = 0, iRet = 0;
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

    iRet = Minimum(p,iSize);

    printf("Smallest number is : %d",iRet);

    free(p);

    return 0;
}