#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    
    char s[100];
    printf("Hello, World! \n");
    scanf("%[^\n]%*c", &s);
      
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    printf("%s",s);
    return 0;
}