#include<stdio.h>
int main()
{
	int r,c,i,j;
  scanf("%d",&r);
  scanf("%d",&c);
  int A[r][c];
  int B[r][c];
  for(i=0;i<r;i++){
  for(j=0;j<c;j++){
  scanf("%d",&A[i][j]);
  }
  }
   for(i=0;i<r;i++){
  for(j=0;j<c;j++){
  scanf("%d",&B[i][j]);
  }
  }
   for(i=0;i<r;i++){
  for(j=0;j<c;j++){
  A[i][j]=A[i][j]-B[i][j];
    printf("%d ",A[i][j]);
  }
     printf("\n");
  }
	return 0;
}