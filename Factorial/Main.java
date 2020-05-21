#include<iostream>
using namespace std;
int fact(int n)
{
  if(n>=1)
    return fact(n-1)*n;
  else
    return 1;
}
int main()
{
  int n;
  cin>>n;
  int res=fact(n);
  cout<<"The factorial of "<<n<<" is "<<res;
  return 0;
}