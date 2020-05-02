#include<iostream>
using namespace std;
int main()
{
  string s,x,t;
  std::cin>>s;
  int l=s.length();
  for(int i=0;i<l;i++)
  {
   x=s[i];
   int a=int(s[i]);
   if((a>=65 && a<=90)||(a>=97 && a<=122))
   {
    t=t+x;
   }
  }
  std::cout<<t;
}
