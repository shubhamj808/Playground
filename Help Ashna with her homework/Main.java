#include<iostream>
using namespace std;
int main()
{
  int a,b,add,sub,mul,div,mod;
  std::cin>>a>>b;
  add=a+b;
  sub=a-b;
  mul=a*b;
  div=a/b;
  mod=a%b;
  cout<<"a+b="<<add;
  cout<<"\na-b="<<sub;
  cout<<"\na*b="<<mul;
  cout<<"\na/b="<<div;
  cout<<"\na%b="<<mod;
  return 0;
}