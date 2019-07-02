#include <stdio.h>
int main() 
{
    int n;
    scanf("%d",&n);
    int A[n];
    int i;
  for(i=0;i<n;i++){
  scanf("%d",&A[i]);
  }
  for(i=0;i<n-1;i++){
  if(A[i]==A[i+1]){
    int k=i+1;
    while(A[i]==A[k]){
    k++;
    }
    int j=i+1;
    int r = k-i-1;
   while(k<n){
   A[j]=A[k];
     j++;
     k++;
   }
    n=n-r;
  }}
    for(i=0;i<n;i++){
    printf("%d ",A[i]);
    }
  
	return 0;
}