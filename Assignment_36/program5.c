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

void DisplayLarge(PNODE head)
{
    int iMax = 0;
    int iNo = 0, iDigit = 0;

    if(head == NULL)
    {
        printf("Invalide input\n");
        return;
    }

    while(head != NULL)
    {
        iNo = head->data;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            iNo = iNo / 10;
        }
    }
    printf("Largest digit is : %d",head->data,iMax);
    head = head->next;
}

int main()
{
    PNODE first = NULL;

    InsertFirst(&first,41);
    InsertFirst(&first,32);
    InsertFirst(&first,20);
    InsertFirst(&first,11);

    Display(first);

    DisplayLarge(first);

    return 0;
}