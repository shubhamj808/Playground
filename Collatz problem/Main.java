#include<iostream>
using namespace std;
int main()
{
	int i=0,a;
	cin >> a;
	cout<<a<<"\n";
	
		while(a>1)
		{
			if (a % 2 == 0)
			{
				a = a / 2;
				cout << a << "\n";
			}
			else
			{
				a = 3 * a + 1;
				cout << a << "\n";
			}
			
			i++;
		}
		cout << i;
	
	
	
	return 0;
}