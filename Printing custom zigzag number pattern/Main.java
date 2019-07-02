#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int i,j,k;
  for(i=1;i<=n;i++){
     if(i%2!=0){
       for(j=1;j<=n-1;j++){
         printf("%d",i);
                          }
       printf("%d\n",(i+1));
               }
    else{
      printf("%d",(i+1));
      for(j=1;j<=n-1;j++){
        printf("%d",i);
                        }
      printf("\n");
        }
                   }
	return 0;
}