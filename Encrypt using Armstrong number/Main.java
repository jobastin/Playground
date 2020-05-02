#include<iostream>
#include<cmath>
int power(int m,int n)
{
  return pow(n,m);
}
int arm(int n)
{
  int x=n,y=n,z=n;
  int m=0;
  int s=0;
while(x!=0)
{
  m++;
  x=x/10;
}
while(y!=0)
{
int r=y%10;
s=s+power(m,r);
y=y/10;
}
if(s==n)
  return 1;
else
  return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}