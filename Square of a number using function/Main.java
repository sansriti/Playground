#include<stdio.h>
int main() {
   // Type your code here
  int n;
  scanf(" %d",&n);
  int s = sq(n);
  printf("%d",s);
   return 0;
}
int sq(int a){
int b = a*a;
  return b;
}