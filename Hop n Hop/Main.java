#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int c=3,d=4;
  int a,b,y,x,z,f;
  cin>>a>>b;
  x=(a-c);
  y=(b-d);
  x*=x;
  y*=y;
  z=x+y;
  f=sqrt(z);
  cout<<f;
  return 0;
}
