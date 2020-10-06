#include<iostream>
using namespace std;
int main()
{
	int m, n;
	cin >> m >> n;
	int x = m + n;
	int sum = 0, div;
	for (int i = 1; i < x; i++)
	{
		div = x % i;
		if (div == 0)
			sum = sum + i;
	}
	if (sum == x)
		cout << "They can read the message";
	else
	{
		cout << "They can't read the message";
	}
}