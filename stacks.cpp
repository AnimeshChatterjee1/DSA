#include<iostream>
using namespace std;

    int s[10],top=-1,max=9;
  //push
    void push(int x) {
        if(top>=9)
            cout << "Stack overflow" << endl;
        else{
            top++;
            s[top] = x;
        }
    }
    void pop()
    {
        if(top<=-1)
            cout << "Stack Underflow" << endl;
            else{
            cout << "popping out" << s[top] << endl;    
            top--;     
        }
        }
    void disp(){
        if(top>=0){
            cout << "The stack elements are" << endl;
            for (int j = top; j >=0;j--){
                cout << s[j] << " ";
                cout << endl;
            }
        }else
            cout << "Stack is empty" << endl;}
    
    int main(){
        int choice;

        cout << "1 for push || 2 for pop || 3 for display || 4 for end" << endl;
     
        do{
               cin >> choice;
        switch(choice){
            case 1:{
                int x;
                cin >> x;
                push(x);
                break;
            }
            case 2:{
                pop();
                break;
            }
            case 3:{
                
                disp();
                break;
            }
            case 4:{
                cout << "Exit" << endl;
                break;
            }
            default:{
                cout << "Invalid Choice";
            }

        }
        } while (choice != 4);
        return 0;
    }