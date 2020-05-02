#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n-1];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int s;
  std::cin>>s;
  int b=0;
  for(int j=0;j<n;j++)
  {
    if(s==a[j])
    {
    std::cout<<"She passed her exam";
      b=1;
    break;
    }
  }
  if(b==0)
    std::cout<<"She failed";
}