n=int(input("Enter a number:\n"))
sum=0

while n>0:
           rem=int(n%10)
           sum+=int(rem*rem)
           n=int(n/10)
           if n==0 and  sum>9 :
               n=sum
               sum=0

if sum==1:
       print("Happy Number")
else:        
      print("Not an happy Number")
    