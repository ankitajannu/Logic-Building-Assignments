#include<stdio.h>
#include<stdlib.h>

int CountEven(int Arr[], int iLength)
{
    int i = 0, iCount = 0;

    for(i = 0; i < iLength; i++)
    {
        if((Arr[i] % 2) == 0)
        {
            iCount++;
        }
    }
    return iCount;
}
int main()
{
    int iSize = 0, iCnt = 0 , iRet = 0;
    int *p = NULL;

    printf("Enter number of elements : ");
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

    iRet = CountEven(p,iSize);

    printf("Result is  : %d",iRet);

    free(p);

    return 0;
}