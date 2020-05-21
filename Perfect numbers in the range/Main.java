#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  int p,sum=0;
   for(int i= x; i<= y; i++){
                   p=1;
                   while(p<=(i/2)){
                   if(i % p == 0)
                   sum=sum+p;
                   p++;
                   }
                   if(sum==i)
                   printf("%d ",i);
                   sum=0;
                   }
  return 0;
}