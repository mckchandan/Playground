#include<iostream>
using namespace std;
int gcd(int a, int b) 
{ 
  
    if (a == 0) 
       return b; 
    if (b == 0) 
       return a; 
   
  
    if (a == b) 
        return a; 
   
   
    if (a > b) 
        return gcd(a-b, b); 
    return gcd(a, b-a); 
} 
int main()
{
  int a,b;
  cin>>a>>b;
  int res=gcd(a,b);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<res;
  return 0;
}