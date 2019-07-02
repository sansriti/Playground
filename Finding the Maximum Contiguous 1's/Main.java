#include<stdio.h>
int main()
{
 int n;
  scanf("%d",&n);
  int A[n],i,m=0,t=0;
  for(i=0;i<n;i++){
  scanf("%d",&A[i]);
   if(A[i]==1){t++;}
    else{
    if(t>m){m=t;}
      t=0;
    }
  }
  printf("%d",m);
  return 0;
}