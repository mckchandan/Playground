#include <iostream>
#include<string>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   struct student s1;
  cin.getline(s1.name,50);
  cin>>s1.roll>>s1.marks;
  cout<<"\nStudent Details"<<endl;
  cout<<"Name: "<<s1.name<<endl;
  cout<<"Roll: "<<s1.roll<<endl;
  cout<<"Marks: "<<s1.marks<<endl;
    return 0;
}