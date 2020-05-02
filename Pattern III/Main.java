#include <iostream>
using namespace std;
int main()
{
int n;
std::cin>>n;
int num=n;
int x=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
if(i==1)
  cout<<x;
else if(j==i)
  cout<<x;
else
  cout<<x<<"*";
}
num++;
cout<<endl;
x++;
}
int y=n;
for(int i=n;i>0;i--)
{
for(int j=1;j<=i;j++)
{
if(i==1)
  cout<<y;
else if(j==i)
  cout<<y;
else
  cout<<y<<"*";
}
num--;
cout<<endl;
y--;
}
return 0;
}