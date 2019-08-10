#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int main()
{
    int a,b,c,d;
    
    float  x,y,e,f;
    scanf("%d%d",&a,&b);
    scanf("%f%f",&e,&f);
    c=a+b;
    d=a-b;
    x=e+f;
    y=e-f;
    printf("%d %d \n",c,d);
    printf("%.1f %.1f",x,y);    
    
    return 0;
}
