/*
 6.
 */
public class bubble {
   public static void main(String[] args) {
    int a[]={3,6,4,22,13,1,2};
    System.out.println("Original Array:");
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    }
    for(int i=0;i<a.length;i++)
    {
    for(int j=0;j<a.length-1-i;j++)
    {
        if(a[j]>a[j+1])
        {
            int t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
    }
}
   System.out.println("\nSorted Array:");

   for(int i=0;i<a.length;i++)
   {
    System.out.print(a[i]+" ");
   }
  }
} 
