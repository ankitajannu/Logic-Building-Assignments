#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0, iCnt = 0;

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1,iCnt = 1; j <= iCol; j++, iCnt++)
        {
            if((i % 2) == 0)
            {
                printf("%d\t",-iCnt);
            }
            else
            {
                printf("%d\t",iCnt);
            }    
        }
        printf("\n");
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows and columns : ");
    scanf("%d%d",&iValue1,&iValue2);

    Pattern(iValue1,iValue2);

    return 0;
}