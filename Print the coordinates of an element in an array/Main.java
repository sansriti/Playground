#include<stdio.h>
int main()
{
  int n,m;
  scanf("%d",&n);
  scanf("%d",&m);
  int A[n][m];
 int i,j;
  for(i=0;i<n;i++){
   for(j=0;j<m;j++){
   scanf("%d",&A[i][j]);
   }
  }
  int b;
  scanf("%d",&b);
  //printf("%d",b);
  int done = 0;
  for(i=0;i<n;i++){
  for(j=0;j<m;j++){
  if(b==A[i][j]){
    done = 1;
  break;
  }
  }
    if(done==1){break;}
  }
  if(done==1){
 printf("(%d, %d)",i,j);}
  else{
  printf("(-1, -1)");
  }
  return 0;
}