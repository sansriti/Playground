#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int A[n+1],i;
  for(i=0;i<n;i++){
    int a ;
    scanf("%d",&a);
    if(a>n||A[a]==1){
    continue;}
    else{
    A[a]=1;
    }
                      }
  for(i=1;i<=n;i++){
  if(A[i]!=1){printf("%d",i);
              break;}
  }
   return 0;
}