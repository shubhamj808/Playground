#include<iostream>
using namespace std;
int main()
{
	int i,j,m, n;
	cin >> m >> n;
	int mat[10][10];
	int sum = 0;
	for (i = 0; i < m; i++)
	{
		for (j = 0; j < n; j++)
		{
			cin >> mat[i][j];
		}
	}
	for (i=0;i<m;i++)
	{
		sum = 0;
		for (j = 0; j < n; j++)
		{
			sum += mat[i][j];
		}
		cout << sum << endl;
	}
}