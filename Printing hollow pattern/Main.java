#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int i,j,k;
   for(i=1;i<=n;i++){
  printf("*");
  }
  printf("\n");
  for(i=1;i<=n-2;i++){
    printf("*");
    for(j=1;j<=n-2;j++){
    printf(" ");
    }
    printf("*");
    printf("\n");
                   }
  for(i=1;i<=n;i++){
  printf("*");
  }
	return 0;
}