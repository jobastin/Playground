#include<iostream>
using namespace std;
int main()
{
  int a,b;
  float f;
  std::cin>>f>>a>>b;
  float m=a*f;
  if(b<m)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
    
}