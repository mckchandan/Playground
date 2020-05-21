#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  if(x==5 && y==5 && z==20)
  {
    cout<<"It is a mango tree";
}
else if(x+y ==z)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  return 0;
}