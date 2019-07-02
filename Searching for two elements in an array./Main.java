#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  int A[10];
  int a,b,i;
  scanf("%d",&n);
  for(i=0;i<n;i++){scanf("%d",&A[i]);}
  scanf("%d",&a);
  scanf("%d",&b);
  int f=-1;
  int d=-1;
  int ans=0,j;
  for(i=0;i<n;i++){
 if(A[i]==a || A[i]==b){
 if(A[i]==a){f=i;}
   else{d=i;}
 }
  }
  printf("%d\n",f);
  printf("%d",d);
  return 0;
}