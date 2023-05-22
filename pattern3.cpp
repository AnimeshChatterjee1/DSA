#include<iostream>
using namespace std;
int main(){
    int i = 1, n;
    cout<<"Enter a number for range";
    cin >> n;
    while(i<=n){
        int j=1;
        while(j<=n){
            cout << j;
            j += 3;
    }
    cout << endl;
    i += 1;
}
return 0;
}