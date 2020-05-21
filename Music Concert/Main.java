#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int *a;
  int n;
  int m=0,f=0;
  cin>>n;
  a=(int *)calloc(n,sizeof(int));
  for(int i=0;i<n;i++)
    cin>>a[i];
  for(int i=0;i<n;i++)
  {
    if(a[i]%2 == 0)
      f++;
    else
      m++;
  }
  cout<<m<<endl<<f<<endl;
  return 0;
}