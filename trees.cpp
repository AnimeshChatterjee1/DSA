#include<iostream>
using namespace std;
class node{
    public:
    int data;
    node *left;
    node *right;
    //constructor
    node(int d) {
        this->data = d;
        this->left = NULL;
        this->right = NULL;
    }
};
node* buildtree(node* root){
    cout << "Enter Data" << endl;
    int data;
    cin >> data;    //cout<< 
    root = new node(data); 
    if(data ==-1){
        return NULL;
    }
        cout << "enter left node" << endl;
        root->left = buildtree(root->left);
        cout<< "enter right node" << endl;
        root->right = buildtree(root->right);
        return root;
    }

int main(){
    node* root;
    root = buildtree(root);
}