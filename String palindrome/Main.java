#include<stdio.h>
#include<string.h>
int main()
{
char A[10];
 scanf("%s",A);
 int i=0;
  int j=strlen(A);
 j--;
  int s=0;
  while(i<j){
  if(A[i]==A[j]){
    i++;
    j--;
    continue;}
    else{
    s=1;
      break;
    }
  }
  if(s==1){
  printf("%s is not a palindrome",A);
  }
  else{
  printf("%s is a palindrome",A);
  }
  return 0;
}