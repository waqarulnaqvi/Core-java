import java.util.*;
class happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int rem,sum=0;
        while(n!=0)
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
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not an happy Number");
        }
    }
}