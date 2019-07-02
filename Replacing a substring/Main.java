#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char A[30];
  char a[20];
  char b[20];
  gets(A);
  gets(a);
  gets(b);
  int t = strlen(A);
  int found = 1;
  int p = strlen(a);
  int i,j=0,f,l;
  for(i=0;i<t-p+1;i++){
  for(j=0;j<p;j++){
  if(A[i+j]==a[j]){
  j++;
  }
    else{
    j=0;
     found = 0; 
      break;
    }}
    if(found==1){
    break;
    }
    else{found=1;}
  }
  char temp[30];
  int z=0;
  for(j=0;j<i;j++){
  temp[z]=A[j];
    z++;
  }
  for(j=0;j<strlen(b);j++){
  temp[z]=b[j];
    z++;
  }
  for(j=i+strlen(a);j<strlen(A);j++){
  temp[z]=A[j];
    z++;
 
  }
   printf("%s",temp);
  return 0;
}