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

void Reverse(PNODE head)
{
    int iRev = 0;

    while(head != NULL)
    {
        int iNo = head->data;

        while(iNo != 0)
        {
            iRev = iRev + 10 + (iNo % 10);
            iNo = iNo / 10;
        }
    }
    iRev = head->data;
    head = head->next;
    
    printf("%d",iRev);
}

int main()
{
    PNODE first = NULL;

    InsertFirst(&first,89);
    InsertFirst(&first,6);
    InsertFirst(&first,41);
    InsertFirst(&first,17);
    InsertFirst(&first,82);
    InsertFirst(&first,11);

    Display(first);

    Reverse(first);

    return 0;
}