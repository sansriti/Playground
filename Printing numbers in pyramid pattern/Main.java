#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int i,j,k,c=1;
  for(i=1;i<=n;i++){
    for(k=1;k<=n-i;k++){
      printf(" ");
                       }
    for(j=1;j<=i;j++){
      printf("%d ",c);
      c++;
                     }
    printf("\n");
                   }
	return 0;
}