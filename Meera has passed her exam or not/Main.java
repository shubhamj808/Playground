#include<iostream>
using namespace std;
int main()
{
  int n,m,i,flag;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>m;
  for(i=0;i<n;i++)
  {  
  if(a[i]==m)
  flag=1;
  }
  (flag==1)?cout<<"She passed her exam":cout<<"She failed";
}