#include<bits/stdc++.h> 
#include<iostream>
using namespace std; 
void printWords(string str) 
{ 
	string word; 
	int t=0;
	string c[50],x,y,q="null";
	stringstream iss(str); 
	while (iss >> word) 
		 {
		     c[t++]=word;
		 }
	for(int i=0;i<t;i++)
	{
	    x=c[i];
	    for(int j=i+1;j<t;j++)
	    {
	        y=c[j];
	        if((c[i].compare(c[j])) == 0)
	        {
	          c[i].assign(q);
	          c[j].assign(q);
	          break;
	        }
	        x="";
	        y="";
	    }
	}
	for(int i=0;i<t;i++)
	{
	    if(c[i]==q)
	    continue;
	  cout<<c[i]<<" ";  
	}
}  
int main() 
{ 
	string s; 
  	getline(cin,s); 
	printWords(s); 
	return 0; 
} 
