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
  }}
  for(i=0;i<r;i++){
  for(j=0;j<c;j++){
  scanf("%d",&B[i][j]);
  }}
  int done =0;
  for(i=0;i<r;i++){
  for(j=0;j<c;j++){
  if(A[i][j]!=B[i][j]){done=1;
                      break;}
  }}
  if(done==1){
  printf("No");
  }
  else{
  printf("Yes");
  }
	return 0;
}