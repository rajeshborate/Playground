#include<stdio.h>
int main()
{
  int a,b;
  int count=1;
  scanf("%d%d",&a,&b);
  for(int i=1;i<=a && i<=b;i++){
  if(a%i==0 && b%i==0)
    count=i;
 
  }
  int lcm=(b*a)/count;
  printf("%d",lcm);
  
  //Type your code here
  return 0;
}