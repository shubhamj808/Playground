#include <iostream>
using namespace std;
int main() 
{
	int n,a=0,rem;
  cin>>n;
  while(n!=0)
  {
    rem=n%10;
    a=a*10+rem;
    n=n/10;
  }
  cout<<a;
	return 0;
}