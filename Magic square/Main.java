// C++ program to check whether a given 
// matrix is magic matrix or not 
#include <bits/stdc++.h> 
#include <iostream>
using namespace std; 
int main() 
{ 
int N,b=1;
std::cin>>N;
int mat[N][N];
for (int i=0;i<N;i++) 
{
for (int j=0;j<N;j++)
{
std::cin>>mat[i][j];
}
}
	int sum = 0,sum2=0; 
	for (int i = 0; i < N; i++) 
		sum = sum + mat[i][i]; 
	// the secondary diagonal 
	for (int i = 0; i < N; i++) 
		sum2 = sum2 + mat[i][N-1-i]; 
	if(sum!=sum2) 
		b=0; 

	// For sums of Rows 
	for (int i = 0; i < N; i++) { 
		
		int rowSum = 0;	 
		for (int j = 0; j < N; j++) 
			rowSum += mat[i][j]; 
		
		// check if every row sum is 
		// equal to prime diagonal sum 
		if (rowSum != sum) 
			b=0; 
	} 

	// For sums of Columns 
	for (int i = 0; i < N; i++) { 
		
		int colSum = 0;	 
		for (int j = 0; j < N; j++) 
			colSum += mat[j][i]; 

		// check if every column sum is 
		// equal to prime diagonal sum 
		if (sum != colSum) 
		b=0; 
	}    
	if(b==1) 
		cout << "Yes"; 
	else
		cout << "No"; 
	return 0; 
} 