#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node *next;
};
//function 
struct node* insert_at_first(struct node*head,int data){
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->next = head;
    ptr->data = data;
    return ptr;
}
void linked_list_traversal(struct node* ptr){
    while(ptr!=0){
        printf(" ELement%d---", ptr->data);
        ptr = ptr->next;

    }
}
int main(){
    struct node *head;
    struct node *second;
    struct node *third;
    struct node *fourth;
    // Allocate memory for nodes in the linked list in Heap
    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth = (struct node *)malloc(sizeof(struct node));

    //linking nodes
    head->data=9;
    head->next = second;
    second->data = 7;
    second->next = third;

    third->data = 5;
    third->next = fourth;
   
   fourth->data=1;
   fourth->next = NULL;
   head = insert_at_first(head, 99);

   linked_list_traversal(head);
//    return 0;
}