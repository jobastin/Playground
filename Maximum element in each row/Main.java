#include<stdio.h>
#include<iostream>
int main(){
int r,c;
std::cin>>r>>c;
int a[r][c],i,j,max[10];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
scanf("%d",&a[i][j]);
}
}
for(i=0;i<r;i++)
{
max[i]=0;
for(j=0;j<c;j++)
{
if(a[i][j]>max[i])
{
max[i]=a[i][j];
}
}
}
for(i=0;i<r;i++)
{
std::cout<<max[i]<<"\n";
}
}