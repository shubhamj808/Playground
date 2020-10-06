#include<iostream>
    using namespace std;
    int main()
    {
        
        int m,l,d,a;
      cin>>m>>l>>d;
        a = m * l;
        if (a >= d)
        {
            cout << "Can reach";
        }
        else
        {
            cout << "Cannot reach";
        }

    }