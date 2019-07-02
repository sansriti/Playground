#include <stdio.h>

int main() {
	int a;
	scanf("%d",&a);
	 
	    int ans=0;
	    int k=0;
	    while(a>0){
	        a= a&(a-1);
	        ans++;
	    }
	    printf("%d\n",ans);
	
	return 0;
}