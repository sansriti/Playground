#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int n=a;
  int b=1;
  int sum=0;
  while(n>0){
  b=b*10;
  n=n/10;  
  }
  b=b/10;
 
  sum=sum+(a/b)+(a%10);
  printf("%d",sum);
	return 0;
}