#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
 for (int i = 0; i < c; i++) { 
        // initialize the maximum element 
        // with 0 
        int maxm = a[0][i]; 
  
        // Run the inner loop for rows 
        for (int j = 1; j < r; j++) { 
            // check if any element is greater  
            // than the maximum element 
            // of the column and replace it 
            if (a[j][i] > maxm) 
                maxm = a[j][i]; 
        } 
  
        // print the largest element of the column 
        cout << maxm << endl; 
    } 
  
  return 0;
      
}