#include<stdio.h>
int main()
{
  int a = 365;
  int b = 4;
  int c = a%b;
  int d = a/b;
  printf("Quotient: %d\n",d);
  printf("Remainder: %d\n",c);
  return 0;
}