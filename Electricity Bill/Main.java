#include<iostream>
using namespace std;
int main()
{
  int u;
  std::cin>>u;
  if(u<=200)
  {
    std::cout<<"Rs."<<int(u*0.5);
  }
  else if(u<=400)
  {
  std::cout<<"Rs."<<(u*0.65)+100;
  }
  else
  {
    std::cout<<"Rs."<<(u*0.80)+200;
  }   
}