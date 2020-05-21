#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  cout<<"Enter first number : Enter second number : Menu"<<endl;
cout<<"1.Addition"<<endl;   
cout<<"2.Subtraction"<<endl;
cout<<"3.Multiplication"<<endl;
cout<<"4.Division"<<endl;
cout<<"5.Remainder"<<endl;
  switch(z)
  {
    case 1:cout<<(x+y);break;
    case 2:cout<<(x-y);break;
    case 3:cout<<(x*y);break;
    case 4:cout<<(x/y);break;
    case 5:cout<<(x%y);break;
    default:cout<<"Invalid operation";
  }
  return 0;
}