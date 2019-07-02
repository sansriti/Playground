#include <stdio.h>
int main() {
	//Type your code
     int n ;
  scanf("%d",&n);
  int i,t=0;
  int sum=1;
  int b = n;
  int a=0;
  while(n>0){
    sum=1;
    a=n%10;
    n=n/10;
  for(i=1;i<=a;i++){
  sum=sum*i;
  }
    t=t+sum;
  }
  if(t==b){
  printf("Yes");
  }
  else{
  printf("No");
  }
	return 0;
}