#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
  struct Node{
  int data;
  struct Node*next;
  };
  int n;
  scanf("%d",&n);
  int i;
  struct Node*front=NULL;
  struct Node*rear= NULL;
  for(i=0;i<n;i++){
    char C[20];
    scanf("%s",&C);
    if(strcmp(C,"enqueue")==0){
    int d;
      scanf("%d",&d);
      if(front==NULL){
      struct Node*n1 = (struct Node*)malloc(sizeof(struct Node));
       n1->data = d;
        n1->next=NULL;
       front=n1;
        rear=n1;
      }
      else{
       struct Node*n1 = (struct Node*)malloc(sizeof(struct Node));
       n1->data = d;
        n1->next=NULL;
        rear->next=n1;
        rear=rear->next;
      }
   }
    else if(strcmp(C,"dequeue")==0){
    if(front!=NULL){
    struct Node *n1 = front;
     int d = front->data;
      front = front->next;
      free(n1);
      printf("%d\n",d);
    }
    }
    else{
    struct Node*n1 = front;
      while(n1!=NULL){
      printf("%d ",n1->data);
        n1=n1->next;
      }
      printf("\n");
    }
  }
    return 0;
}