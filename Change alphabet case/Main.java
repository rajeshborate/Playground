#include <stdio.h>
int main() {
  char a;
  scanf("%c",&a);
  if(a<97){
    a=a+32;
    printf("%c",a);
  }
  else{
  a=a-32;
    printf("%c",a);
  }
	// Type your code here
	return 0;
}