#include <iostream>
#include <stdio.h>
#include <string.h>
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
std::cin.get(str,100);
  int t=strlen(str);
  t=t-1;
  for(i=t;i>=0;i--)
  {
      rev[count++]=str[i];
  }
std::cout<<rev;
}