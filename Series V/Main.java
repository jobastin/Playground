#include <iostream>
#include <cmath>
int main()
{
int n;
std::cin>>n;
int x=11;
for(int i=0;i<n;i++)
{
std::cout<<pow(x,2)<<" ";
x=x+4;
}
}