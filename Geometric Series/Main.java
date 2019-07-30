#include<stdio.h>
int main()
{
  int a,b=3,c,d,va,sum,pos,i;
  int n;
  scanf("%d",&n);
  if(n%2==1){
    a=1;
  pos=(n+1)/2;
    sum=a*pow(2,pos-1);
    printf("%d",sum);
  }
 
  else{
    a=1;
    pos=n/2;
    sum=a*pow(3,pos-1);
    
    printf("%d",sum);
  }//type your code here
  return 0;
}