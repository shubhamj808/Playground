
#include<iostream>
using namespace std;
int main()
{
    int a, b, c,d;
    cout << "Enter first number :";
    cin >> a;
    cout << " Enter second number :";
    cin >> b;
    cout << " Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
    cin >> c;
    switch (c)
    {
    case 1:
        d = a + b;
        cout << d;
        break;
    case 2:
        d = a - b;
        cout << d;
        break;
    case 3:
        d = a * b;
        cout << d;
        break;
    case 4:
        d = a / b;
        cout << d;
        break;
    case 5:
        d = a % b;
        cout << d;
        break;
      case 6:
        cout<<"Invalid operation";
        
     
    }
}