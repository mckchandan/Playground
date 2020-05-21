#include<iostream>
using namespace std;
int main(){
  int x=0;
  cin>>x;
  int fact=1;
  for(int i=1;i<=x;i++)
  {
  	fact=fact*i;
  }
  cout<<fact;
}