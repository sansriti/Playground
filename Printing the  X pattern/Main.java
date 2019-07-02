#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int i,j,k;
  for(i=1;i<=n/2;i++){
    for(j=1;j<i;j++){
      printf(" ");
                    }
    printf("*");
    for(k=1;k<=n-2*i;k++){
      printf(" ");
                         }
    printf("*");
    printf("\n");
                  }
      for(i=1;i<=n/2;i++){
    printf(" ");
    }
  printf("*\n");
  for(i=1;i<=n/2;i++){
    for(j=i;j<n/2;j++){
      printf(" ");}
    printf("*");
     for(k=1;k<=(i-1)*2+1;k++){
       printf(" ");
                              }

      printf("*");
      printf("\n");
                       }
                     
	return 0;
}