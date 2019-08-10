#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
int main(){
    char arr[1001],i;
    int j,count;
    scanf("%s",arr);
    for(i=48;i<=57;i++){
        count =0 ;
        for(j=0;j<strlen(arr);j++){
            if(arr[j]==i){
                count++;

            }
        }
        printf("%d ",count);

    }
    return 0;
}
