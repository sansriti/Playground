#include <stdio.h>
int main(){
	// Type your code here
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int m = g(a,b,c);
  printf("%d",m);
  	return 0;
}
int g(int a,int b,int c){
  int temp;
if(a>b){
temp = a;
}
  else{
  temp = b;
  }
  if(temp>c){
  return temp;
  }
  else{return c;}
}