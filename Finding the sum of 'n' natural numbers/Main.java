#include <stdio.h>

int main(int argc, char *argv[])
{
 int d;
  scanf("%d",&d);
  printf("%d",find(d));
  return 0;
}
int find(int n){
if(n==1){return 1;}
  else{
  return (n+find(n-1));
  }
}