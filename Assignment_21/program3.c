#include<stdio.h>
#include<stdlib.h>

int Difference(int Arr[], int iLength)
{
    int i = 0, iMax = 0, iMin = 0;

    if((Arr == NULL) || (iLength <= 0))
    {
        printf("Invalid input");
        return -1;
    }

    iMax = Arr[0];
    iMin = Arr[0];

    for(i = 0; i < iLength; i++)
    {
        if(Arr[i] > iMax)
        {
            iMax = Arr[i];
        }
        if(Arr[i] < iMin)
        {
            iMin = Arr[i];
        }
    }
    return iMax - iMin;
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

    iRet = Difference(p,iSize);

    printf("Difference is : %d",iRet);

    free(p);

    return 0;
}