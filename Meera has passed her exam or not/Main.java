#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
    int num=0;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];

  cin>>num;
  //cout<<num<<endl;
  int flag=0;
  for(int i=0;i<n;i++)
  {
    if(a[i] == num)
    flag=1;  
  }
  if(flag)
    	cout<<"She passed her exam";
    else
     	cout<<"She failed";
      
}