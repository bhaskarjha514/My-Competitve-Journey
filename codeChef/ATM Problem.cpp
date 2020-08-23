#include <iostream>
using namespace std;
int main()
{
    int amount;
    double remBal;
    double balance;
    string message;
    
    cin>>amount;
    cin>>balance;
    
    if(amount%5==0){
        if(amount<balance && amount+0.5<balance){
            remBal = balance - amount - (0.5);
            message = "balance remained "+ to_string(remBal) + " Rs";
            cout<<message<<endl;
        }else{
            message = "Not enough amount!";
            cout<<message<<endl;
        }
        
    }else{
        message = "Not Valid "+to_string(balance);
        cout<<message<<endl;
    }
}
