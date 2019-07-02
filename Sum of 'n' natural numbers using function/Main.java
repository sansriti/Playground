#include<stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int s = Na(n);
  printf("%d",s);
  	return 0;
}
int Na(int a){
int i ;
  int s=0;
  for(i=1;i<=a;i++){
  s = s+i;
  }
  return s;
}