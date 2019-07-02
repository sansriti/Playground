#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int sum=0;
  int n = a;
  int b=n;
  int count=0;
  while(a>0){
  count++;
  a=a/10;
  }
  while(n>0){
  int a = n%10;
  sum=sum+pow(a,count);
  n=n/10;  
  }
  if(b==sum){
    printf("Armstrong Number");
  }
  else{
  printf("Not an Armstrong Number");
  }
	return 0;
}