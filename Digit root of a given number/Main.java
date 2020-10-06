#include<iostream>
using namespace std;
int droot(int x)
{
	int sum = 0;
	while (x > 0)
	{
		sum = sum + x % 10;
		x = x / 10;
	}
	if (sum > 10) 
	{
		sum=droot(sum);
	}
	return sum;
}

int main()
{
	int k;
	cin >> k;
	cout << droot(k);
}