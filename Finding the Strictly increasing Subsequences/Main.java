#include<stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  int A[n];
  int i,j,k;
  for(i=0;i<n;i++){
  scanf("%d",&A[i]);
  }
  for(i=0;i<n;i++){
   for(j=i+1;j<n;j++){
    int done = 0;
   if(A[j]>A[i]){
   for(k=i+1;k<j;k++){
   if(A[k]<A[j]){}
     else{
     done =1;
       break;
     }
   }
     if(done==0){
     printf("%d,%d\n",A[i],A[j]);
     }
   }
   }
  }
  
	return 0;
}