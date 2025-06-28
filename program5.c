#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void InsertFirst(PPNODE head, int no)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

    if(*head == NULL)   
    {
        *head = newn;
    }
    else               
    {
        newn->next = *head;
        *head = newn;
    }
}

void Display(PNODE head)
{
   
    while(head != NULL)
    {
        printf("| %d | -> ",head->data);
        head = head->next;
    }
    printf("NULL\n");
}

int SumDigit(PNODE head)
{
    int iSum = 0;


    while(head != NULL)
    {
        int iNo = head->data;
        while(iNo != 0)
        { 
            iSum = iSum + (iNo % 10);
            iNo = iNo / 10;
        }
        head->data;
        head = head->next;
        
    }
    return iSum;
}

int main()
{
    PNODE first = NULL;
    int iRet = 0;

    InsertFirst(&first,640);
    InsertFirst(&first,240);
    InsertFirst(&first,20);
    InsertFirst(&first,230);
    InsertFirst(&first,110);

    Display(first);

    iRet = SumDigit(first);

    printf("Addition of digits of elements are : %d\n",iRet);

    return 0;
}