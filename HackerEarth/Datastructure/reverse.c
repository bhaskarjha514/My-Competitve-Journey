#include<stdio.h>
int main(){
    int i,n=0,a[2000];
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=n-1;i>=0;i--){
        printf("%d\n",a[i]);
    }
    return 0;
}
