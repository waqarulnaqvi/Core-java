import java.util.*;
class  pt_3_array_deletion_tut_4
{
    public static void main(String []args)
    {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Element of the array 1");
    int a[]=new int[5];
    int b[]=new int[a.length-1];
    for(int i=0;i<a.length;i++)
    {
       System.out.printf("a[%d]=",i);
        a[i]=sc.nextInt();
    }
    System.out.println("Array value is");
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println("\nEnter index of new value to be deleted");
    int m=sc.nextInt();
    for(int i=0;i<a.length;i++)
    {
      if(i<m)
      {
        b[i]=a[i];
      }
      else if(i==m)
      {
        continue;
      }
      else{
        b[i-1]=a[i];
      }
    }
    System.out.println("New Array value is");
    for(int i=0;i<b.length;i++)
    {
      System.out.print(b[i]+" ");
    }
    }
}