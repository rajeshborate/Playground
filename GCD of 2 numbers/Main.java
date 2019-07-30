// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a,b;
  int count=1;
  scanf("%d%d",&a,&b);
  for(int i=1;i<=a && i<=b;i++){
  if(a%i==0 && b%i==0)
    count=i;
  
  }
  printf("%d",count);
  // Enter your code here 
  
   return 0;
}