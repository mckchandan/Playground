#include<iostream>
using namespace std;
int main()
{
 int age,year;
  cin>>age>>year;
  if(age>year && year != 00)
  {
    int min=100-age;
    int max=min+year;
    cout<<abs(max);
  } 
  else if(year == 00)
  {
    age=100-age;
    cout<<abs(age);
  }
    else
    {
    age=year-age;
      cout<<abs(age);
    }
 
}