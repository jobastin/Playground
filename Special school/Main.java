#include<iostream>
using namespace std;
int main()
{
  string s,s1;
  std::cin>>s>>s1;
  int l=s.length();
  int b=1,a=l-1;
  string x,y;
  for(int i=0;i<l;i++)
  {
    x=s[i];
    y=s1[a];
    //std::cout<<x<<"*"<<y;
    if((x.compare(y))!=0)
    {
      b=0;
      break;
    }
    a--;
  }
  if(b==1)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}