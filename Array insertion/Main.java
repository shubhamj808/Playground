#include<iostream>
using namespace std;

int main()
{
	int i,a,l,val;
	cout << "Enter the number of elements in the array"<<endl;
	cin >> a;
	int* arr = new int[a];
	cout << "Enter the elements in the array"<<endl;
	for (i = 0; i < a; i++)
	{
		cin >> arr[i];
	}
	cout << "Enter the location where you wish to insert an element"<<endl;
	cin >> l;
	if (l > a)
	{
		cout << "Invalid Input"<<endl;
	}
	else
	{
		cout << "Enter the value to insert"<<endl;
	
	cin >> val;
	cout << "Array after insertion is"<<endl;
	for (i = 0; i < l - 1; i++)
	{
		cout << arr[i]<<endl;
	}
	cout << val<<endl;
	for (i = l -1; i < a; i++)
	{
		cout << arr[i]<<endl;
	}
    }
}