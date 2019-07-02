#include <stdio.h>
int main() {
	//Type your code
   int a ;
  scanf("%d",&a);
  int i;
  int sum=1;
  for(i=1;i<=a;i++){
  sum=sum*i;
  }
  printf("%d",sum);
	return 0;
}