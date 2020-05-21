#include<iostream>
using namespace std;
int main()
{
  int t1=0,t2=1;
  int n;
  cin>>n;
  int count=4;
  int next;
  next=t1+t2;
  while(count<=n)
  {
    count++;
    t1=t2;
    t2=next;
    next=t1+t2;
  }
  cout<<next;
  return 0;
}