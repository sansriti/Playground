#include<stdio.h>
#include<string.h>
void Push(int);
void Pop();
void Print();
int A[];
int k=0,n;
int main() {
  scanf("%d",&n);
  A[n];
  int i=0;
  for(int i=0;i<n;i++){
  char B[10];
  scanf("%s",B);
  if(strcmp(B,"push")==0){
  int a;
  scanf("%d",&a);
   Push(a); 
  }
  else if(strcmp(B,"pop")==0){
  Pop();
  }
   else{
   Print();
   } 
  }
    return 0;
}
void Push(int a){
A[k]=a;
  k++;
}
void Pop(){
printf("%d\n",A[k-1]);
  k--;
}
void Print(){
int t;
  for(t=0;t<k;t++){
  printf("%d ",A[t]);
  }
  printf("\n");
}