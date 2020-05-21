#include<iostream>
using namespace std;
int main()
{
  int x,y,cost;
  cin>>x;
  if(x<=200)
  {
    cost=0.5*x;
    cout<<"Rs."<<cost;
  }
  if(x>200 && x<=400)
  {
    cost=0.65*x;
    cost+=100;
    cout<<"Rs."<<cost;
  }
  if(x>400 && x<=600)
  {
    cost=0.80*x;
    cost+=200;
    cout<<"Rs."<<cost;
  }
  
  if(x>600)
  {
    cost=1.25*x;
    cost+=425;
    cout<<"Rs."<<cost;
  }
  return 0;
}