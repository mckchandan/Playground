#include<iostream>
using namespace std;
struct emp{
  char name[50];
  int age;
  int id;
  char des[50];
  int salary;
};
int main()
{
  struct emp emp;
  cin.getline(emp.name,50);
  cin>>emp.id;
  cin>>emp.age;
  
  cin>>emp.des;
  cin>>emp.salary;
  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\nEmployee Details\n";
cout<<"Name of the Employee : "<<emp.name<<endl;
cout<<"ID of the Employee : "<<emp.id<<endl;
cout<<"Age of the Employee : "<<emp.age<<endl;
cout<<"Designation of the Employee : "<<emp.des<<endl;
cout<<"Salary of the Employee : "<<emp.salary;
  return 0;
}