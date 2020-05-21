#include <iostream>
using namespace std;
int main() 
{
  int n,remainder=0,rev=0;
  cin>>n;
	while (n != 0) {
        remainder = n % 10;
        rev = rev * 10 + remainder;
        n /= 10;
    }
  cout<<rev;
	return 0;
}