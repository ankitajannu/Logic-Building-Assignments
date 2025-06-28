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

int SecMaximum(PNODE head)
{
    int iMax1 = head -> data;
    int iMax2 = head -> data;
    head = head->next;
    
    while(head != NULL)
    {

        if(head->data > iMax1)
        {
            iMax2 = iMax1;
            iMax1 = head->data;
        }
        else if((head->data > iMax2) && (head->data != iMax1))
        {
            iMax2 = head->data;
        }
        head = head->next;
    }
    return iMax2;
}

int main()
{
    PNODE first = NULL;
    int iRet = 0;

    InsertFirst(&first,240);
    InsertFirst(&first,320);
    InsertFirst(&first,230);
    InsertFirst(&first,110);

    Display(first);

    iRet = SecMaximum(first);

    printf("Second Maximum is : %d\n",iRet);

    return 0;
}