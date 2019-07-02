#include<stdio.h>
int main()
{
 int n;
  scanf("%d",&n);
  n++;
 int A[n],i;
  for(i=0;i<n-1;i++){
  scanf("%d",&A[i]);
  }
  int t;
  scanf("%d",&t);
  if(A[n-2]<t){
  A[n-1]=t;
  }
  else{
  int done = 1;
  int i=n-2;
    while(done==1){
    if(A[i]>t){A[i+1]=A[i];}
    else{
      A[i+1]=t;
      done =0;
      break;
    }
      i--;
    }
  }
  for(i=0;i<n;i++){printf("%d ",A[i]);}
  return 0;
}