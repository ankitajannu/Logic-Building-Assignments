#include<stdio.h>
#include<stdlib.h>

int Difference(int Arr[], int iLength)
{
    int i = 0, iSum1 = 0, iSum2 = 0;

    if(iLength < 0)
    {
        iLength = -iLength;
    }

    for(i = 0; i < iLength; i++)
    {
        if((Arr[i] % 2) == 0)
        {
            iSum1 = iSum1 + Arr[i];
        }
        else
        {
            iSum2 = iSum2 + Arr[i];
        }
    }
    return iSum1 - iSum2;
}

int main()
{
    int iSize = 0, iRet = 0, iCnt = 0;
    int *p = NULL;

    printf("Enter number of elements : \n");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("\nEnter elements %d : ",iCnt + 1);
        scanf("%d",&p[iCnt]);
    }

    iRet = Difference(p,iSize);

    printf("Result is %d",iRet);

    free(p);

    return 0;
}