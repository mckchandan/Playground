#include<iostream>
using namespace std;
int main()
{
 int x1,x2,x3,y1,y2,y3;
  cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float a1=(x1+x2+x3);
  a1/=3;
  float a2=(y1+y2+y3);
  a2/=3;
  cout<<a1<<endl;
  cout<<a2;
}