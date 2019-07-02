#include<stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  int A[n];
  int i,j;
  for(i=0;i<n;i++){
  scanf("%d",&A[i]);
  }
  for(i=0;i<n;i++){
  for(j=i+1;j<n;j++){
  if(A[j]>A[i]){
  printf("%d,%d\n",A[i],A[j]);
  }
  }
  }
	return 0;
}