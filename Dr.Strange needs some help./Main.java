#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int doc(int,int,int);
  int m,n,r;
  cin>>m>>n>>r;
  int res;
  res=doc(m,n,r);
  if(res==1)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}
int doc(int m,int n,int r)
{
  int a;
  a=pow(m,n);
  if(a<r)
    return 0;
  else
    return 1;
}
      