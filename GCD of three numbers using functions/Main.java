#include <stdio.h>
int main() {
	//Type your code here
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int temp = gcd(a,b);
  temp = gcd(temp,c);
  printf("%d",temp);
	return 0;
}
int gcd(int a,int b){
int temp;
  if(a>b){
  temp = a;
  }
  else{
  temp = b;
  }
  while(temp>=1){
  if(a%temp==0 && b%temp==0){
  return temp;
  }
    temp--;
  }
  return 1;
}