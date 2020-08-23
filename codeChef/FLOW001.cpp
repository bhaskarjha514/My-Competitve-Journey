// Shivam is the youngest programmer in the world, he is just 12 years old. Shivam is learning programming and today he is writing his first program.

// Program is very simple, Given two integers A and B, write a program to add these two numbers.

// Input
// 3 
// 1 2
// 100 200
// 10 40

// Output
// 3
// 300
// 50

#include<iostream>
using namespace std;

int main(){
    int test,i;
    cin>>test;
    
    for(i=0;i<test;i++){
        int a, b; cin>>a>>b;
        cout<<a+b<<endl;
    }
}