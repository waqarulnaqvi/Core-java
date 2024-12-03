class Array_sum_avg {
   public static void main(String[] args) {
    double a[]={1.2,2.6,3.3,2.3,3.3,5,4,4,3,4.3};
    double sum=0,avg;
    for(int i=0;i<a.length;i++)
    {
        sum+=a[i];
    }
    avg=sum/a.length;
    System.out.println("Sum of array element ="+ sum);
    System.out.println("Average of array element = "+ avg);
   }  
}
