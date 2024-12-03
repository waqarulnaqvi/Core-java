#include <stdio.h>
using std lib;

int main()
{
    printf("Enter a number:");
    int rem,sum=0,n;
    cin>>n;
      
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
         cout<<("Happy Number");
        }
        else{
        cout<<("Not an happy Number");
        }

}
8888888888
