#include<iostream>
using namespace std;
int main()
{
	int i, n=6, a;
	cin >> a;
	for (i = 0; i < a; i++)
	{
		n = n + 5 * i;
		cout << n << " ";
	}
}