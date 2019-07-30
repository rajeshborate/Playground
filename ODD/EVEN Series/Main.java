#include<stdio.h>
int main()
{
  int n,val=1;
  scanf("%d",&n);
  if(n%2==0)
  {
  val=(n/2)-1;
   printf("%d",val);
  
  }
  else
  {
  val=n-1;
    printf("%d",val);
  }
	//type your code here
	
}