#include<iostream>
using namespace std;
int main()
{
  	double x1,x2,x3; 
	double y1,y2,y3;
  	std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  	double x=(x1+x2+x3)/3; 
	double y=(y1+y2+y3)/3;
  	std::cout<<x<<"\n"<<y;
  return 0;
}
