#include<stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  printf("%d",find(n));
	return 0;
}
int find(int n){
if(n==1){return 1;}
  else{
  return(n*find(n-1));
  }
  
}