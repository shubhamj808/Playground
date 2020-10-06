#include<iostream>
using namespace std;
int main()
{
	int n, count = 0;
	float score = 0.0;
	do
	{
		cin >> n;
		if (n < 0)
		{
			score = score - 1;
		}
		else if(n%2==1)
		{
			score++;
			count++;
		}
		else
		{
			score = score - 0.5;
		}
	} while (n > 0 && count != 3);
	cout << score;
}