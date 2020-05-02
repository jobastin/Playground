#include<iostream>
int main(){
  int n;
  std::cin>>n;
  int a[n];
  for(int j=0;j<n;j++)
  {
    std::cin>>a[j];
  }
  int e=0,d=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e++;
    else
      d++;
  }
  std::cout<<d<<"\n"<<e;
}