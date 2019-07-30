#include <stdio.h>
int main() {
  int n;
  scanf("%d", &n);
  int secondDigit = n;
  while(n > 100)
  {
    n /= 10;
    //printf("%d",n);
  }
  secondDigit = n%10;
  printf("%d", secondDigit);
	//Type your code
	return 0;
}