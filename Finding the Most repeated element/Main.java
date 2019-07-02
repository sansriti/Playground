#include<stdio.h>
int main()
{
 int n;
  scanf("%d",&n);
  int A[n],i,m=0,t=1,j,a=0,b=0;
  for(int i=0;i<n;i++){scanf("%d",&A[i]);}
  for(i=0;i<n;i++){
    if(A[i]!=-1){
      b=A[i];
      for(j=i+1;j<n;j++){
        if(A[i]==A[j]){t++;
                       
                      A[j]=-1;}
                      }
      if(m<t){m=t;
              t=1;
              a=b;
             }
                }
                  }
  printf("%d",a);
  return 0;
}