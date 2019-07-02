#include<stdio.h>
int main()
{
char A[100];
  int i,j;
  scanf("%[^\n]%*c",A);
  int l = strlen(A);
  for(i=0;i<l-2;i++){
  if((A[i]=='t'||A[i]=='T')&&(A[i+1]=='h') && A[i+2]=='e'){
  for(j=i+4;j<l;j++){
  A[j-4]=A[j];   
  }
    l = l-4;
  }
  }
  for(i=0;i<l;i++){printf("%c",A[i]);}
	return 0;
}