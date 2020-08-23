#include <iostream>
using namespace std;
int main()
{
    int t;    
    cin>>t;
    
    while(t--){
        int a, b, rem;
        cin>>a>>b;
        rem = a % b;
        cout<<rem<<endl;
    }
}
