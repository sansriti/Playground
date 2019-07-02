#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int i,j;
  for(i=1;i<=n;i++){
    for(j=n-i+1;j>=1;j--){
      printf("%d",j);
                         }
    printf("\n");
                   }
	return 0;
}