#include<stdio.h>
#include<string.h>
int main()
{
	char A[30];
  int done = 0;
  scanf("%[^\n]%*c",A);
  int l = strlen(A);
  int B[26],i;
  for(i=0;i<l;i++){
  int u = A[i]-97;
  B[u]++;
  }
  for(i=0;i<l;i++){
   int k = A[i]-97;
  if(B[k]==1){
  char ch = k+97;
    printf("%c",ch);
    done = 1;
    break;
  }
  }
  if(done==0){printf("All the characters are repetitive");}
  
  
	return 0;
}