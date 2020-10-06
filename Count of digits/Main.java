#include<iostream>
using namespace std;
int main()
{
    int a, num=0;
    cin >> a;
    do
    {
        a = a / 10;
        num++;
    } while (a != 0);
    cout << num;
    return 0;
}
