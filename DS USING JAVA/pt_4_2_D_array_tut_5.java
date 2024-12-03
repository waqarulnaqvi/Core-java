import java.util.*;
class pt_4_2_D_array_tut_5
{
    public static void main(String []args)
    {
    Scanner sc =new Scanner(System.in);
    //int a[][][];//3D array..
/*    System.out.println("Enter a number of rows:");
    int m=sc.nextInt();
    System.out.println("Enter a number of columns:");
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    for(int i=0;i<m;i++)
    {
    for(int j=0;j<n;j++)
    {
        System.out.printf("a[%d][%d] :  ",i,j);
        a[i][j]=sc.nextInt();
    }
    }
    System.out.println("\nMatrix 1:");
    for(int i=0;i<m;i++)
    {
    for(int j=0;j<n;j++)
    {
        System.out.print(a[i][j]+"\t");     
    }
    System.out.println();
    }
    */

    // int b[][]=new int [][]{{2,3,4},{3,7,8},{}};//Run
    // int b[][]=new int [][]{{2,3,4},{3,7,8},};//Run
    int b[][]=new int [][]{{2,3,4},{3,7,8}};
    System.out.println("\nMatrix 2:");
    for(int i=0;i<b.length;i++)
    {
    for(int j=0;j<b[i].length;j++)
    {
        System.out.print(b[i][j]+"\t");       
    }
    System.out.println();
}

    /*Addition of a Matrix: 
    int c[][]=new int[m][n]; 
    for(int i=0;i<m;i++)
    {
    for(int j=0;j<n;j++)
    {
        c[i][j]=a[i][j]+b[i][j];
    }
    }
    System.out.println("\nMatrix 1 + Matrix 2:");
    for(int i=0;i<m;i++)
    {
    for(int j=0;j<n;j++)
    {
        System.out.print(c[i][j]+"\t");
    }
    System.out.println();
    }*/

    /*Multiplication of Matrix:
    int mul[][]=new int[m][b[0].length];
    if(n==b.length)
    {
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<b[0].length;j++)
        {
            int sum=0;
            for(int k=0;k<b.length;k++)
            {
          sum+= a[i][k]*b[k][j];
            }
            mul[i][j]=sum;
        }  
        }
    System.out.println("\nMatrix 1 * Matrix 2:");
    for(int i=0;i<m;i++)
    {
    for(int j=0;j<b[0].length;j++)
    {
        System.out.print(mul[i][j]+"\t");
    }
    System.out.println();
}
    }
else{
    System.out.println("Multiplication not possible..");
}*/

/*Transpose of a Matrix: */
System.out.println("\nTranspose of Matrix 2:");
for(int i=0;i<b[0].length;i++)
{
for(int j=0;j<b.length;j++)
{
    System.out.print(b[j][i]+"\t");
}
System.out.println();
}
}
}