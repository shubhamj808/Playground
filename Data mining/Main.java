#include<iostream>
using namespace std;
int main()                //data ming using function
{
	int x,sum = 0, sum1 = 0, n1;
  cin>>x;
	while (x > 0)
	{
		n1 = x % 10;        //separating last digit from number ex:-143%10=3
		if (n1 % 2 == 0)     //even number
		{
			sum = sum + n1;
		}                          //sum of odd digits in a number should be equal to sum of even digits in a number
		else
		{
			sum1 = sum1 + n1;   //odd number
		}
		x = x / 10;            //separating the number from its last digit ex:-143/10=14
	}
	if (sum == sum1)
	{
		cout<<"Yes";
	}
	else
	{
		cout<<"No";
	}
}
