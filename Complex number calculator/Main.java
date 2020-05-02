#include <iostream> 
using namespace std;
int main()
{
   int a,b,c,d,ch;
   cin>>ch>>a>>b>>c>>d;
    switch (ch)
    {
    case 1:cout<<(a+c)<<"-"<<(b+d)<<"i";
        break;
    case 2:cout<<(a-c)<<"+"<<(b-d)<<"i";
        break;
    case 3:cout<<((a*c)-(b*d))<<((a*d)+(b*c))<<"i";
        break;
    default:cout<<"Invalid choice";
    break;
}
   return 0;
}