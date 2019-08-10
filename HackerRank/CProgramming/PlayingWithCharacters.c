#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
     char a[20],b[40],c[100];
     scanf("%[^\n]%*c",&a);
    scanf("%[^\n]%*c",&b);
    scanf("%[^\n]%*c",&c);
    printf("%s \n%s\n%s",a,b,c);    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}