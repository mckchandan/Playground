#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  int i;
  for(i=0;i<n;i++)
    cin>>a[i];
  int max=a[0];
  for(i=0;i<n;i++)
  {
    if(max >a[i])
      max=max;
    else
      max=a[i];
  }
  cout<<max;
  return 0;
  }
  
  