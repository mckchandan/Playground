#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int x;
  cin>>x;
  int first=x;
   
  while(first>=10)
  {
    first/=100;
    
  }
  int last=x%10;
	if(first == 0)
      first = 1;
  else
    first = 0;
  cout<<(first+last);
}