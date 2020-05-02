#include <iostream>
void fun(int &a, int &b)
{	
  	int t=a;
    t=a;
  	a=b;
    b=t;
}
int main()
{
    int x,y;
  	std::cin>>x>>y;
  	std::cout<<"Before swapping a= "<<x<<" and b="<<y;
    fun(x,y);
    std::cout<<"\nAfter swapping a= "<<x<<" and b="<<y;
    return 0;
}