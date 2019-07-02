#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int A[n];
  int i;
  int c=0;
  for(i=0;i<n;i++){scanf("%d",&A[i]);
                  if(A[i]==0){c++;}
                  }
  for(i=0;i<n;i++){
  if(A[i]!=0){printf("%d ",A[i]);}
  }
     for(i=0;i<c;i++){printf("0 ");}
  return 0;
}