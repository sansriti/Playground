#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int i,k,j;
  for(i=1;i<=n;i++){
    int a = (n-i);
     for(j=1;j<=a;j++){
       printf(" ");
                     }
      for(k=1;k<=(2*(i-1)+1);k++){
      printf("*");
       }
    printf("\n");
                   }
	return 0;
}