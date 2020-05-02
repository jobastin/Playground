#include <bits/stdc++.h> 
#include<iostream>
using namespace std; 
const int MAX = 100; 
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
for (int i = 0; i < m; i++) 
    { 
		int maxm = mat[0][i]; 
		for (int j = 1; j < n; j++)
        { 
			if (mat[j][i] > maxm) 
				maxm = mat[j][i]; 
		} 
		cout << maxm << endl; 
	} 
return 0; 
} 