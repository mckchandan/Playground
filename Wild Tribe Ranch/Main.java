#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  if(x == y )
    cout<<"Yes, you can enter. Kindly use a rope.";
  else if(x > y)
    cout<<"Yes, you can enter.";
  else
    cout<<"Sorry, you can't enter";
  return 0;
}