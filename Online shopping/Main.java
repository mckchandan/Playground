#include<iostream>
using namespace std;
int main()
{
  float fkcost=0,fkdis=0,fkship=0,snapcost=0;
  float snapdis=0,snapship=0,amcost=0,amdis=0,amship=0;
  cin>>fkcost>>fkdis>>fkship;
  cin>>snapcost>>snapdis>>snapship;
  cin>>amcost>>amdis>>amship;
  float temp;
 
  temp=(fkdis/100);
   float flipkart=fkcost-(temp*fkcost)+fkship;
  temp=(snapdis/100);
   float snapdeal=snapcost-(temp*snapcost)+snapship;
  temp=(amdis/100);
   float amazon=amcost-(temp*amcost)+amship;
  cout<<"In Flipkart Rs."<<flipkart<<endl;
cout<<"In Snapdeal Rs."<<snapdeal<<endl;
cout<<"In Amazon Rs."<<amazon<<endl;
  if(amazon<snapdeal && amazon<flipkart)
    cout<<"He will prefer Amazon";
  else if(snapdeal<flipkart)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Flipkart";
  
  return 0;
}