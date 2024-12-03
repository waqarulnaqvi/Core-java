
//In array time complexity of the element is very high during insertion or deletion..
//undo is performed with the help of stack..
//Traverse means accessing each and every element..
//array Traverse means accessing each and every element of the array..
import java.util.*;

class pt_2_array_insertion_tut_3 {
  public static void main(String []args)
    {
    Scanner sc =new Scanner(System.in);

   /*Method 1: 
    System.out.println("Enter Element of the array 1");
    int a[]=new int[5];
    int b[]=new int[a.length+1];
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
    System.out.println("\nEnter index of new value to be inserted");
    int m=sc.nextInt();
    System.out.println("Enter new value to be inserted");
    int o=sc.nextInt();
    for(int i=0;i<b.length;i++)
    {
      if(i<m)
      {
        b[i]=a[i];
      }
      else if(i==m)
      {
        b[i]=o;
      }
      else{
        b[i]=a[i-1];
      }
    }
    System.out.println("New Array value is");
    for(int i=0;i<b.length;i++)
    {
      System.out.print(b[i]+" ");
    }*/

   /*Method 2: */
    System.out.println("Enter Element of the array 1");
    int a[];
    a=new int[6];
    for(int i=0;i<a.length-1;i++)
    {
       System.out.printf("a[%d]=",i);
        a[i]=sc.nextInt();
    }
    System.out.println("Array value is");
    for(int i=0;i<a.length-1;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.printf("\nEnter index between 0 to %d  of new value to be inserted:\n",(a.length-2));
    int m=sc.nextInt();
    System.out.println("Enter new value to be inserted");
    int o=sc.nextInt();
    for(int i=a.length-1;i>m;i--)
    {
      a[i]=a[i-1];
      }
      a[m]=o;
    System.out.println("New Array value is");
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
}
}