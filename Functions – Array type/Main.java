#include<iostream>
using namespace std;

int main()
{
	int i,arr[20],n;
	cout << "Enter the number of elements in the array\n";
	cin >> n;
	cout << "Enter the elements in the array\n";
	for (i = 0; i < n; i++)
	{
		cin >> arr[i];
	}
	int odd = 0, even = 0;
	for (i = 0; i < n; i++)
	{
		if (arr[i] % 2 == 1)
			odd++;
		if (arr[i] % 2 == 0)
			even++;
	}
	if (even == n)
		cout << "The array is Even";
	else if (odd == n)
		cout << "The array is Odd";
	else
		cout << "The array is Mixed";
}