#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int A[n],i;
  int sum=0,temp=0;
  for(i=0;i<n;i++){
  scanf("%d",&A[i]);
    if(i==0){
    temp=A[0];
    }
    else{
    if(A[i-1]<=A[i]){
    temp = temp+A[i];
    }
    else{
    if(sum<temp){sum=temp;}
     temp = A[i]; 
    }  
    }
  }
  if(sum<temp){sum = temp;}
  printf("%d",sum);
  return 0;
}