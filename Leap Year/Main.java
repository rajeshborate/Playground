#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%400==0 && n%4==0)
    printf("LEAP YEAR");
  else
    printf("NOT LEAP YEAR");
  //Type your code here
  return 0;
}