#include<iostream>
using namespace std;
int main()
{
  int w,a,c;
  cin>>w>>a>>c;
  a*=75;
  c*=30;
  int x=a+c;
  if(x<w)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
 return 0;
  
}