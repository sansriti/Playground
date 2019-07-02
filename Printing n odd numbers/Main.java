#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int i=0;
  int a=1;
  while(i<n){
  if(a%2!=0){
  printf("%d\n",a);
    i++;
  }
    a++;
  }
	return 0;
}