#include <stdio.h>

int main()
{ 
  int a,b,c,d,e,f;
  scanf("%d%c%d%c%d",&a,&d,&b,&e,&c);
  if(a>b && a>c)
    printf("%d",a);
  else if(b>a && b>c)
    printf("%d",b);
  else
    printf("%d",c);
  
    // type your code here
}