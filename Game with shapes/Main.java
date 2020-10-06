#include<iostream>
using namespace std;
int main()
{
	int r, l,c;
	cin >> r >> l;
	if (l == (r +r))
		cout << "circle can be inside a square";
	else
		cout << "circle cannot be inside a square";
}