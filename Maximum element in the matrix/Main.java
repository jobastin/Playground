#include <bits/stdc++.h> 
using namespace std; 
int main() 
{ 
int n,m;
std::cin>>n>>m;
int mat[n][m];
for (int i=0;i<n;i++) 
{
for (int j=0;j<m;j++)
{
std::cin>>mat[i][j];
}
}
  int min = INT_MIN; 
	for (int i = 0; i < n; i++) { 
		for (int j = 0; j < m; j++) { 
			if (mat[i][j] > min) { 
				min=mat[i][j]; 
			} 
		} 
	} 
cout<<"The maximum element is "<<min; 
return 0; 
} 