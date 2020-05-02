#include<stdio.h>
#include<iostream>
 
int Fibonacci_Series(int);
 
int main()
{
   	int Number, Fibonacci,n;
   	scanf("%d", &Number);
    Number=Number-1;
  	n=Number;
   	Fibonacci = Fibonacci_Series(Number);
   	

  	std::cout<<"The term "<<Number+1<<" in the fibonacci series is "<<Fibonacci;
    return 0;
}
 
int Fibonacci_Series(int Number)
{
   	if ( Number == 0 )
    	return 0;
   	else if ( Number == 1 )
    	return 1;
   	else
    	return ( Fibonacci_Series(Number - 1) + Fibonacci_Series(Number - 2) );
}