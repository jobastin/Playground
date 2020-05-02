#include <iostream>
using namespace std;
int main()
{
int p,t,r;
double i=0,a=0,d=0,f=0;
std::cin>>p>>r>>t;
i=(p*t*r)/100;
a=p+i;
d=i*2/100;
f=p+i-d;
std::cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;
return 0;
}