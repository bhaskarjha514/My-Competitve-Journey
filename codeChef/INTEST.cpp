#include <iostream>
using namespace std;

int main(){
    int n, k, i;
    cin>>n>>k;
    int total = 0;
    
    for(i=0;i<n;i++){
        long long int t;
        cin>>t;
        if(t%k==0){
            total++;
        }else{
            total = total;
        }
    }
    cout << total << endl;
}