#include <iostream>
int main()
{
  int n,m,sum=0;
  std::cin>>n>>m;
  int s=n+m,a=s;
  for(int i=1;i<s;i++)
  {
   int r=s%i;
    if(r==0)
    {
    sum=sum+i;
    }
  }
  if(a==sum)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}