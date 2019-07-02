#include<stdio.h>
int main(){
    // Type your code here
  int b,e;
  scanf("%d %d",&b,&e);
  int a = powe(b,e);
  printf("%d",a);
  	return 0;
}
int powe(int b,int e){
int a=1,i;
  for(i=1;i<=e;i++){
  a = a*b;
  }
  return a;
}