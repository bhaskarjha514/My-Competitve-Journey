#include<stdio.h>
int main(){
    int size,rl,j,i,temp,a[90498];
   scanf("%d %d",&size,&rl);
    for(i=0;i<size;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<rl;i++){
        temp=a[0];
        for(j=0;j<size-1;j++){
            a[j]=a[j+1];
        }
        a[size-1]=temp;
    }
    for(i=0;i<size;i++){
        printf("%d ",a[i]);
    }
    
    return 0;
}
