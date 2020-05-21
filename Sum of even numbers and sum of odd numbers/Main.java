#include<iostream>
using namespace std;
int main()
{
 int *a;
  int even=0,odd=0;
  int n;
  cin>>n;
  a=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
    cin>>a[i];
  for(int i=0;i<n;i++)
  {
    if( a[i]%2 == 0)
      even+=a[i];
    else
      odd+=a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<even<<endl;
  cout<<"The sum of the odd numbers in the array is "<<odd;
  return 0;
}