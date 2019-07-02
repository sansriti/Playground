#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int i;
  for(i=1;i<=n;i++){
  printf("%d",i);
    if(i%3==0 && i!=n){
    printf(",");
    }
  }
	return 0;
}