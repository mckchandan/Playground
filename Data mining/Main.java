// C++ implementation of the approach 
#include <bits/stdc++.h> 
using namespace std; 

// Function to return the reverse of a number 
int reverse(int n) 
{ 
	int rev = 0; 
	while (n != 0) { 
		rev = (rev * 10) + (n % 10); 
		n /= 10; 
	} 
	return rev; 
} 

// Function to find the sum of the odd 
// and even positioned digits in a number 
void getSum(int n) 
{ 
	n = reverse(n); 
	int sumOdd = 0, sumEven = 0, c = 1; 

	while (n != 0) { 

		// If c is even number then it means 
		// digit extracted is at even place 
		if (c % 2 == 0) 
			sumEven += n % 10; 
		else
			sumOdd += n % 10; 
		n /= 10; 
		c++; 
	} 
if(sumOdd == sumEven)
cout<<"Yes";
  else
    cout<<"No";
} 

// Driver code 
int main() 
{ 
	int n;
  cin>>n;
	getSum(n); 

	return 0; 
} 
