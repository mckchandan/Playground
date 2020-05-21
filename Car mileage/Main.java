#include<iostream>
using namespace std;
int main()
{
  float mil;
  int lit,dis;
  cin>>mil>>lit>>dis;
  dis/=lit;
  if(dis<mil)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
    

}