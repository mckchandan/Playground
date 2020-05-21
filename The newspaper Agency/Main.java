#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  int res,st;
  cin>>w;
  cin>>x;
  cin>>y;
  res=w*x;
  res=res-(w*y);
  res-=100;
  cout<<res;
}