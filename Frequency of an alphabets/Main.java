// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  char A[20];
  int i;
  gets(A);
  int l[26];
  for(i=0;i<26;i++){l[i]=0;}
  for(i=0;i<strlen(A);i++){
  if(A[i]>='a' && A[i]<='z'){l[A[i]-'a']++;
                           // printf("%d",l[A[i]-'a']);
                            }
    else{
    if(A[i]>='A' && A[i]<='Z'){l[A[i]-'A']++;}
    }
  }
  for(i=0;i<26;i++){
  if(l[i]>0){printf("%c%d ",(char)(i+'a'),l[i]);}
  }
   return 0;
}