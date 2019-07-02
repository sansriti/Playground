#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  int i=a/100;
  int j=a%10;
  int k = i+j;
  printf("%d",k);
  return 0;
}