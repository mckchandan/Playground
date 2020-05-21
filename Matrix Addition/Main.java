#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int x[a][b],y[a][b],z[a][b];
  for(int i=0;i<a;i++)
    for(int j=0;j<b;j++)
      cin>>x[i][j];
  for(int i=0;i<a;i++)
    for(int j=0;j<b;j++)
      cin>>y[i][j];
  for(int i=0;i<a;i++){
    for(int j=0;j<b;j++){
      cout<<x[i][j]+y[i][j]<<" ";
    }
    cout<<endl;
  }
  return 0;
  
}