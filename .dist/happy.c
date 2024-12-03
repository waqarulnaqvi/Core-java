#include <stdio.h>

int main()
{
    printf("Enter a number:");
    int rem,sum=0,n;
    scanf("%d",&n);
      
        while(n>0)
        {
           rem=n%10;
           sum+=rem*rem;
           n=n/10;
           if(n==0 &&  sum>9) 
           {
            n=sum;
            sum=0;
           }            
        }

        if(sum==1)
        {
         printf("Happy Number");
        }
        else{
           printf("Not an happy Number");
        }

}