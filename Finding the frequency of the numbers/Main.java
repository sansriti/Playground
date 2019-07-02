#include<stdio.h>
int main()
{
  int n,k,i;
  scanf("%d",&n);
  scanf("%d",&k);
  int A[k+1];
  for(i=1;i<=k;i++){
  A[i]=0;
  }
  for(i=0;i<n;i++){
    int t;
    scanf("%d",&t);
    A[t]++;
                  }
  for(i=1;i<=k;i++){
  printf("%d %d\n",i,A[i]);
  }
  return 0;
}