#include<iostream>
using namespace std;
int main()
{
  int b,a,c,a1,c1,s;
  std::cin>>b>>a>>c;
  a1=75*a;
  c1=30*c;
  s=a1+c1;
  if(s<b)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}