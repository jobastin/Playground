#include<iostream>
int main(){
int f=1,n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    f=f*i;
  }
  std::cout<<f;
}