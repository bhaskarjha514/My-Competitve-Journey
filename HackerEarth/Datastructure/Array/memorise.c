#include<stdio.h>
int main(){
    int i,j,n,n1,a[100],b[100],count = 0;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    scanf("%d",&n1);
    for(i=0;i<n1;i++){
        scanf("%d",&b[i]);
        }
        printf("\n");
    
    for(j=0;j<n1;j++){
        for(i=0;i<n;i++){
            if(a[i]==b[j]){
                count+=1;
            }
        }
        if(count!=0){
        printf("%d\n",count);
        }
        else{
            printf("NOT PRESENT\n");
        }
        count =0;
    }
    
      return 0;
}