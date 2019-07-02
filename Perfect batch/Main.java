/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int A[n],q=0;
  int i,j,sum=0,prev=0;
  for(i=0;i<n;i++){scanf("%d",&A[i]);}
  for(i=0;i<n;i=i+3){
   sum=A[i+0];
    if(i+1<n){sum=sum+A[i+1];}
    if(i+2<n){sum=sum+A[i+2];}
    if(i==0){
      prev=sum;
    }
    else{
    if(prev==sum){}
      else{q=1;
           break;}
    }
    
  }
  if(q==1){printf("Not a Perfect Batch");}
  else{printf("Perfect Batch");}
  return 0;
}