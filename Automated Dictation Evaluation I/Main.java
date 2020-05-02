#include <iostream> 
using namespace std; 
void compareFunction(string s1, string s2) 
{
  int x = s1.compare(s2); 
  if (x == 0) 
    cout<<"It is correct";
  else
    cout<<"It is wrong";
} 
int main() 
{ 
	string s1; 
	string s2;
  	cin>>s1>>s2;
	compareFunction(s1, s2); 
	return 0; 
} 
