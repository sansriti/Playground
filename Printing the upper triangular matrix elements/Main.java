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
  for(i=0;i<c;i++){
  for(j=0;j<r;j++){
 if(j+i<c){
 printf("%d ",A[j][j+i]);
 }
  }
  }
 
	return 0;
}