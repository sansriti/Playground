#include<stdio.h>
int main()
{
	int n,i,j;
  scanf("%d",&n);
  int A[n];
  for(i=0;i<n;i++){scanf("%d",&A[i]);}
  int t = n/2;
  for(int i=0;i<t;i++){
  int key = A[i];
    j = i-1;
    while(j>=0 && A[j]>key){
    A[j+1]=A[j];
      j--;
    }
    A[j+1]=key;
  }
  for(i=t;i<n;i++){
    int key = A[i];
    j = i-1;
    while(j>=t && A[j]<key){
    A[j+1]=A[j];
      j--;
    }
    A[j+1]=key;
  }
  for(i=0;i<n;i++){printf("%d ",A[i]);}
	return 0;
}