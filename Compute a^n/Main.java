#include<iostream>
using namespace std;
int power(int x, int y)
{
	if (y== 0)
		return 1;
	else
		return x * power(x, y - 1);

}

int main()
{
	int a, b;
	cout << "Enter the value of a ";
	cin >> a;
	cout << "\nEnter the value of n ";
	cin >> b;
	cout<<"\nThe value of " << a <<" power "<< b <<" is "<<power(a, b);

}