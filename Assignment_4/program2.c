#include<stdio.h>
  
void FactRev(int iNo)
{
    int iRev = 0, iDigit = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo != 0)
    {
        iDigit = iNo % 10;

        iRev = iRev * 10 + iDigit;
        iNo = iNo / 10;
        iDigit--;
    }

}

int main()
{
    int iValue = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    FactRev(iValue);

    return 0;
}