// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int n;
  scanf("%d",&n);
  int A[n];
  int i,max=0,j=0;
  for(i=0;i<n;i++){scanf("%d",&A[i]);}
  for(i=0;i<n;i++){
  if(j<=A[i]){j=A[i];
            max=i;}
  }
  printf("%d",max);
   return 0;
}