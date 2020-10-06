#include<iostream>
using namespace std;
int main()
{
    int a,amt;
    
    cin >> a;
    if (a <= 200)
    {
        amt = a * 0.5;
        cout << "Rs."<<amt;
    }
    else if(a<=400)
    { 
        amt = (a * 0.65) + 100;
        cout << "Rs." << amt;
    }
    else if (a <= 600)
    {
        amt = (a * 0.80) + 200;
        cout << "Rs." << amt;
    }
    else if(a > 600)
    {
        amt = (a * 1.25) + 425;
        cout << "Rs." << amt;
    }
}