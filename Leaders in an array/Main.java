#include <stdio.h>
int main() 
{
  int n;
  scanf("%d",&n);
  int A[n];
  int i;
  for(i=0;i<n;i++){
  scanf("%d",&A[i]);
  }
  int l=A[n-1]-1;
  int ans[n];
  int k=0;
  i=n-1;
  while(i>=0){
  if(l<A[i]){
  ans[k]=A[i];
    k++;
   l=A[i]; 
  }
    i--;
  }
  for(i=k-1;i>=0;i--)
  printf("%d ",ans[i]);
    return 0;
}