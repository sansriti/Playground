#include <stdio.h>
int main() {
	//Type your code
int n;
  scanf("%d",&n);
  int m=n;
  int sum=1;
  int a,b=1;
  while(m>0){
  b=b*10;
  m=m/10;
  }
 
  b=b/10;
 
  int i=1;
  while(i<=2){
  a=n/b;
    n=n%b;
   b=b/10;
   
    i++;
  }
  printf("%d",a);
	return 0;
}
