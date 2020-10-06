#include<iostream>
using namespace std;
int main()
{
	int a, n=11, i,sum=0;
	cin >> a;
	for (i = 0; i < a; i++)
	{
		sum = (n + 4 * i) * (n + 4 * i);
		cout << sum << " ";
	}
}