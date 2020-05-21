#include<iostream>
using namespace std;
int main()
{
 int a,b,c,d;
  cin>>a>>b>>c>>d;
  int res=a+c;
  int temp=b+d;
  if(temp>100)
  {
    res++;
    temp%=100;
  }
  cout<<res<<endl;
  cout<<temp;
  return 0;
  
}