#include<iostream>
using namespace std;
int main()
{
  int x;
  string res;
  cin>>x;
  res = ((x%2)==0) ? "Even": "Odd";
	cout<<res;
}