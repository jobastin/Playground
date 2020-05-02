#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int n;
std::cin>>n;
int b=1;
for(int i=1;i<=n;i++)
{
  if(i%2==0)
    b=2;
  else
    b=1;
  int x=pow(i,2);
  int y=x-b;
  std::cout<<y<<" ";
}
}