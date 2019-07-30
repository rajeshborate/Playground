#include<stdio.h>
int main()
{
  int n,f,s,nextTerm=1;
  f=0;
  s=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++){
  
        printf("%d ", f);
        nextTerm = f + s;
        f = s;
        s = nextTerm;
  }
  //Type your code here
  return 0;
}