#include <bits/stdc++.h>
#include <boost/multiprecision/cpp_int.hpp>
using namespace std;
using namespace boost::multiprecision;

int main() {
    int t,n;
    cin>>t;
    while(t--)
    {
         cin>>n;
         cpp_int fact=1;
         for (int i=1; i<=n;i++)
            {
                fact = fact*i;
            }
         cout<<fact<<endl;
           
        
        
    }
    
}
