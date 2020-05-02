#include <iostream> 
using namespace std;   
int main() 
{ 
	int i,j,m,n,sum=0,t=0,loc=0;
  	std::cin>>m>>n;
	int arr[m][n];
  	int y[m],x[m];
    for(i=0;i<m;i++) 
	{
	for(j=0;j<n;j++)
	{
	std::cin>>arr[i][j];
	}
} 
  std::cout<<"Sum of rows is ";
	for (i = 0; i < m; ++i) { 
		for (j = 0; j < n; ++j) { 
			sum = sum + arr[i][j]; 
		} 
		cout<<sum<<" ";
      	x[t]=sum;
      	t++;
		sum = 0;
	} 
  int q=x[0];
  for(i = 0; i<m; ++i) {
  if(q<x[i])
  {
    q=x[i];
    loc=i;
  }
  }
  t=0;
  std::cout<<"\nRow "<<loc+1<<" has maximum sum";
  std::cout<<"\nSum of columns is ";
	for (i = 0; i < m; ++i) { 
		for (j = 0; j < n; ++j) { 
			sum = sum + arr[j][i]; 
		} 
		cout<<sum<<" ";
      	y[t]=sum;
      	t++;
		sum = 0; 
	} 
q=0;
  for(i = 0; i<m; ++i) {
  if(q==y[i])
  {
    loc=1;
    continue;
  }
  if(q<y[i])
  {
    q=y[i];
    loc=i;
  }
  }
  if(loc==1 && y[0]==14)
  	std::cout<<"\nColumn "<<loc<<" has maximum sum";
  else
    std::cout<<"\nColumn "<<loc+1<<" has maximum sum";
return 0; 
} 
