#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[], int iLength, int iNo)
{
    int i = 0, iFreq = 0;

    if((Arr == NULL) || (iLength <= 0))
    {
        printf("Invalid input");
        return -1;
    }

    for(i = 0; i < iLength; i++)
    {
        if(Arr[i] == iNo)
        {
            iFreq++;
        }
    }
    return iFreq;
}
int main()
{
    int iSize = 0, iCnt = 0 , iRet = 0, iValue = 0;
    int *p = NULL;

    printf("Enter number of elements : ");
    scanf("%d",&iSize);

    printf("Enter the number : ");
    scanf("%d",&iValue);

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

    iRet = Frequency(p,iSize,iValue);

    printf("%d",iRet);

    free(p);

    return 0;
}