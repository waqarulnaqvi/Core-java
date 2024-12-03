import java.util.*;

public class pt_1_array_tut_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int n = sc.nextInt();
        // System.out.println("The number is " + n);

     /* 1 D array:
        int a[]=new int[]{33,33,2,5,56,4};
        int []b=new int[]{33,33,2,5,56,4};
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=sc.nextInt();
        // }
        // for(int i=0;i<a.length;i++)
        // {
        //     System.out.print(a[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<b.length;i++)
        // {
        //     System.out.print(a[i]+" ");
        // }

        int a1[]=new int[n];
        System.out.println("Enter Element of the array 1");
        for(int i=0;i<n;i++)
        {
           System.out.printf("a1[%d]=",i);
            a1[i]=sc.nextInt();
        }
        System.out.println("Array value is");
        for(int i=0;i<n;i++)
        {
          System.out.print(a1[i]+" ");
        }
     
        int []b1=new int[n];
        System.out.println("\nEnter Element of the array 2");
        for(int i=0;i<n;i++)
        {
           System.out.printf("b1[%d]=",i);
            b1[i]=sc.nextInt();
        }
        System.out.println("Array value is");
        for(int i=0;i<n;i++)
        {
          System.out.print(b1[i]+" ");
        }*/

        /*2D array: */
        // System.out.println("The element of matrix 1 is:");
        // int a[][]=new int[][]{{1,2,3},{2,4,3}};
        // // for(int i=0;i<3;i++)//Error..
        // // {
        // for(int i=0;i<2;i++)
        // {
        //   for(int j=0;j<3;j++)
        //   {
        //     System.out.print(a[i][j]+" ");
        //   }
        //   System.out.println();
        // }
        // System.out.println("The element of matrix 2 is:");
        // int [][]b=new int[][]{{12,21,31},{222,14,32}};
        // // for(int i=0;i<3;i++)//Error..
        // // {
        // for(int i=0;i<2;i++)
        // {
        //   for(int j=0;j<3;j++)
        //   {
        //     System.out.print(b[i][j]+" ");
        //   }
        //   System.out.println();
        // }
       int a[][]=new int [2][3];
       int [][]b=new int [2][3];
        System.out.println("\nEnter Element of the matrix 1:");
        for(int i=0;i<2;i++)
        {
          for(int j=0;j<3;j++)
          {
           System.out.printf("a[%d][%d]=",i,j);
            a[i][j]=sc.nextInt();
        }
    }
        System.out.println("\nEnter Element of the matrix 2:");
        for(int i=0;i<2;i++)
        {
          for(int j=0;j<3;j++)
          {
           System.out.printf("b[%d][%d]=",i,j);
            b[i][j]=sc.nextInt();
          }
        }
        System.out.println("The element of matrix 1 is:");
        for(int i=0;i<2;i++)
        {
          for(int j=0;j<3;j++)
          {
            System.out.print(a[i][j]+" ");
          }
          System.out.println();
        }

        System.out.println("The element of matrix 2 is:");
        for(int i=0;i<2;i++)
        {
          for(int j=0;j<3;j++)
          {
            System.out.print(b[i][j]+" ");
          }
          System.out.println();
        }
    }
}
