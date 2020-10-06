#include<iostream>
using namespace std;
int main()
{
    int tot_students,total_handshakes;
    cin >> tot_students;
    total_handshakes = tot_students * (tot_students - 1) / 2;
    cout << total_handshakes;
    return 0;
}
