#include<iostream>
using namespace std;
struct employee
{
  char n[10];
  int id;
  int age;
  char desig[20];
  int s;
}e;
int main()
{
  std::cout<<"Enter name:\n";
  std::cin>>e.n;
  std::cout<<"Enter ID:\n";
  std::cin>>e.id;
  std::cout<<"Enter age:\n";
  std::cin>>e.age;
  std::cout<<"Enter designation:\n";
  std::cin>>e.desig;
  std::cout<<"Enter Salary:\n";
  std::cin>>e.s;
  std::cout<<"Employee Details\n";
  std::cout<<"Name of the Employee : "<<e.n<<"\n";
  std::cout<<"ID of the Employee : "<<e.id<<"\n";
  std::cout<<"Age of the Employee : "<<e.age<<"\n";
  std::cout<<"Designation of the Employee : "<<e.desig<<"\n";
  std::cout<<"Salary of the Employee : "<<e.s;
}