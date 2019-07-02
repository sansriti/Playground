#include <stdio.h>
int main() 
{
	int n,m;
  scanf("%d %d",&m,&n);
  int A[m];
  int B[n];
  int i;
  for(i=0;i<m;i++){
  scanf("%d",&A[i]);
  }
  for(i=0;i<n;i++){
  scanf("%d",&B[i]);
  }
  int C[n+m];
  int p=0;
  int q=0;
  for(i=0;i<n+m;i++){
  	if(p==m){
  		C[i]=B[q];
  		q++;
	  }
	 else if(q==n){
	 C[i]=A[p];
	 p++;
	 } 
  else if(A[p]<B[q]){
  C[i]=A[p];
    p++;
  }
  else{
  C[i]=B[q];
    q++;
  }
  }
  for(i=0;i<n+m;i++){
  printf("%d ",C[i]);
  }
	return 0;
}