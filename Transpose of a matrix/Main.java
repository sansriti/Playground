#include<stdio.h>
int main()
{
  int r,c,i,j;
  scanf("%d",&r);
  scanf("%d",&c);
  int A[r][c];
  for(i=0;i<r;i++){
  for(j=0;j<c;j++){
  scanf("%d",&A[i][j]);
  }
  }
  int B[c][r];
  for(i=0;i<c;i++){
  for(j=0;j<r;j++){
  B[i][j]=A[j][i];
  }
  }
  for(i=0;i<c;i++){
  for(j=0;j<r;j++){
  printf("%d ",B[i][j]);
  }
    printf("\n");
  }
  return 0;
}