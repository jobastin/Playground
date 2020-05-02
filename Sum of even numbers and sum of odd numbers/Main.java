#include<iostream>
using namespace std;
int main()
{
int n,m;
std::cin>>n;
int a[n];
for(int i=0;i<n;i++)
{
 std::cin>>a[i]; 
}
int e=0,t=0;
for(int i=0;i<n;i++)
{
  if(a[i]%2==0)
    e=e+a[i];
  else
    t=t+a[i];
}
std::cout<<"The sum of the even numbers in the array is "<<e;
std::cout<<"\nThe sum of the odd numbers in the array is "<<t;
}