#include<iostream>
using namespace std;
int main()
{
  string s;
  cin>>s;
  for (int i = 0; i < s.size(); i++) { 
          
        
        if (s[i] < 'A' || s[i] > 'Z' && 
            s[i] < 'a' || s[i] > 'z')  
        {    
           
            s.erase(i, 1);  
            i--; 
        } 
    } 
    cout << s; 
  return 0;
}