#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float a=0;
  cin>>p;
  cin>>r;
  cin>>t;
  int res;
  res=(p*t*r)/100;
  cout<<res<<endl;
  cout<<(p+=res)<<endl;
  a=(res*2);
  a/=100;
  cout<<a<<endl;
  float end=p-a;
  cout<<end;
}