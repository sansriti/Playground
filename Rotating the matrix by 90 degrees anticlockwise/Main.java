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
    B[i][j]=0;
  }
  }
  for(i=0;i<r;i++){
  for(j=0;j<c;j++){
  B[i][j]=A[j][c-i-1];
    printf("%d ",B[i][j]);
  }
    printf("\n");
  }
	return 0;
}