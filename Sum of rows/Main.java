#include <iostream> 
using namespace std;   
int main() 
{ 
	int i,j,m,n,sum=0;
  	std::cin>>m>>n;
	int arr[m][n];
    for(i=0;i<m;i++) 
	{
	for(j=0;j<n;j++)
	{
	std::cin>>arr[i][j];
	}
} 
	for (i = 0; i < m; ++i) { 
		for (j = 0; j < n; ++j) { 
			sum = sum + arr[i][j]; 
		} 
		cout<<sum<<"\n";
		sum = 0;
	} 
return 0; 
} 
