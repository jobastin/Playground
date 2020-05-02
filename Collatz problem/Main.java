#include <bits/stdc++.h> 
using namespace std; 
void printCollatz(int n) 
{ 
   int count=0;
	while (n != 1) 
	{ 
      count++;
		cout << n << "\n"; 

		// If n is odd 
		if (n & 1) 
			n = 3*n + 1; 

		// If even 
		else
			n = n/2; 
	} 

	// Print 1 at the end 
	cout << n<<"\n"; 
  cout<<count;
} 

// Driver code 
int main() 
{ 
  	int n;
 	cin>>n;
	printCollatz(n); 
	return 0; 
} 
