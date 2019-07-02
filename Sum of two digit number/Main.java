#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  int s =a/10;
  s=s+(a%10);
  printf("%d",s);
  return 0;
}