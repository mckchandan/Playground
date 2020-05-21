#include<iostream>
using namespace std;

int pow(int a,int b)
{
  if(b)
  {
    return a*pow(a,b-1);
  }
  return 1;
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Enter the value of a\nEnter the value of n"<<endl;
  int res=pow(a,b);
  cout<<"The value of "<<a<<" power "<<b<<" is "<<res;
  return 0;
  
}