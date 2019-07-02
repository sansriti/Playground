#include<stdio.h>
int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  int i;
  for(i=2;i<=n;i++){
  if(prime(i)==1){
  printf("%d\n",i);
  }
  }
    return 0;
}
int prime(int a){
int i;
  for(i=2;i<a;i++){
  if(a%i==0){
  return 0;
  }
  }
  return 1;
}