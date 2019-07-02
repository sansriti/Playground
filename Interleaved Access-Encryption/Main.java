#include<stdio.h>
#include<string.h>
int main()
{
 char A[30];
  scanf("%[^\n]%*c",A);
  int k,i,j;
  scanf("%d",&k);
  int l=strlen(A);
  int t = l%k;
  if(t!=0){t = k-t;}
  for(i=0;i<t;i++){A[l+i]='X';}
  A[l+t]='\0';
  int c = (l+t)/k;
  char B[c][k];
  int p=0;
  for(i=0;i<c;i++){
  for(j=0;j<k;j++){
  B[i][j]=A[p];
   
    p++;
  }
    i++;
  for(j=k-1;j>=0;j--){
  B[i][j]=A[p];
    p++;
  }  
  }
  for(i=0;i<k;i++){
  for(j=0;j<c;j++){
  printf("%c",B[j][i]);
  }
  }
  return 0;
}