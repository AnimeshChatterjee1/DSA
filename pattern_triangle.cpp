#include<iostream>
using namespace std;
int main()
{
    int i=1, n;
    cin >> n;
    while (i<=n){
        int j=1;
        while(j<=i){
            cout <<'*';
            j += 1;
        }
        cout << endl;
        i += 1;

    }
    return 0;
}