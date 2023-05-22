#include<iostream>
using namespace std;
int main(){
    int arr[5] = {4, 5, 3, 2, 1};
    for(int i=1;i<=5;i++){
        if(arr[i]>arr[i+1]){
            int t =arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
            
        }
        i++;
    }
    for (int j = 1; j <= 5;j++){
        cout << arr[j] << endl;
    }
}