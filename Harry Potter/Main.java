#include<iostream>
using namespace std;
int main()
{
  int x;
  std::cin>>x;
  int y=x%10;
  int z=x/1000;
  std::cout<<z+y;
}