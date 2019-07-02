#include <stdio.h>
int main(){
	// Type your code here
  int n;
  int count =1;
  scanf("%d",&n);
  int i,j;
  for(i=1;i<=n;i++){
   for(j=1;j<=i;j++){
   if(count%2==1){
   printf("*");
   }
     else{
     printf("#");
     }
     count++;
   }
    printf("\n");
  }
  	return 0;
}