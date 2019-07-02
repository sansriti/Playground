#include<stdio.h>
#include<string.h>
int main()
{
  // Type your code here
  char A[40];
  char B[40];
  gets(A);
  int i,j=0;
  int l = strlen(A);
  for(i=l-1;i>=0;i--){
  if(A[i]!=' '){
    B[j]=A[i];
    j++;
  }
  else{
    int k;
  for(k=j-1;k>=0;k--){printf("%c",B[k]);
  }  
  char a =' ';
    printf("%c",a);
    j=0;
  }}
    int k;
  for(k=j-1;k>=0;k--){printf("%c",B[k]);
  }  
  
  return 0;
}