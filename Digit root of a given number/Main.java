#include<iostream>
using namespace std;
 
int main()
{
    int val, num, sum = 0;
 
    
    cin >> val;
    num = val;
    while (num != 0)
    {
        sum = sum + num % 10;
        num = num / 10;
    }
    num = sum ;
  sum=0;
   while (num != 0)
    {
        sum = sum + num % 10;
        num = num / 10;
    }
  cout<<sum;
  
}