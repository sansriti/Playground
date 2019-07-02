#include<stdio.h>
int main()
{
  //fill the code
  int l=0,n,i;
  int A[10];
  scanf("%d",&n);
  for(i=0;i<n;i++){scanf("%d",&A[i]);
                  if(l<A[i]){l=A[i];}
                  }
  printf("%d",l);
  
  return 0;
}