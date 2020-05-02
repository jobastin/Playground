#include<iostream>
int main()
{
  int n;
 std::cin>>n;
int a[n-1];
int l=0;
for(int i=0;i<n;i++)
{
  std::cin>>a[i];
  if(a[i]>l)
    l=a[i];
}
  std::cout<<l;
}