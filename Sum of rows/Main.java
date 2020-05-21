#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  int sum=0;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      sum+=a[i][j];
    }
    cout<<sum<<endl;
    sum=0;
  }
  return 0;
}
