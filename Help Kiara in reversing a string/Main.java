#include <iostream>
#include<string>
using namespace std;
int main()
{
char str[100];
  cin.getline(str,100);

  int count;
  int i=0;
  while(str[i]!='\0'){
    i++;
    count++;
  }
 for (int i = 0; i < count / 2; i++) 
        swap(str[i],str[count - i - 1]); 
  cout<<str;
  return 0;
}