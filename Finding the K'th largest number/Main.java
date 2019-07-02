#include<stdio.h>
int main()
{
int n,i,j;
scanf("%d",&n);
 int A[n];
 for(i=0;i<n;i++){
   scanf("%d",&A[i]);
                 }
  int k;
  int t,id;
  scanf("%d",&k);
  for(i=0;i<n;i++){
    t=A[i];
    id = i;
    for(j=i;j<n;j++){
      if(A[j]<t){
        t=A[j];
        id=j;
                } }
      if(i!=id){
      int m = A[i];
        A[i]=A[id];
        A[id]=m;
      }
 
                  }

  printf("%d",A[n-k]);
return 0;
}