#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int que,rem,i,ans=0;
    
    scanf("%d", &que);
   for(i=0;i<5;i++)
   {
       rem=que%10;
       que=que/10;
       ans=ans+rem;
   }
   printf("%d",ans);
    return 0;
}

