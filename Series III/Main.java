#include <iostream>
#include <cmath>
int main()
{
int n;
std::cin>>n;
int x=5;
int y=6;
std::cout<<y<<" ";
for(int i=0;i<n-1;i++)
{
std::cout<<y+x<<" ";
y=x+y;
x=x+5;
}
}