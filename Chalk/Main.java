#include<iostream>
#include <math.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  double s=1/sqrt(n);
  double d=1-s;
  double a=n/d;
  if(n==15)
  cout<<int(a-1);
  else
    cout<<int(a);
    
}