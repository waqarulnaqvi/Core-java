//Name:Syed Waqarul Hasan Naqvi
//Enroll:1900102580
//Question 5.Write a program to multiply  two matrices of order mXn and pXq.
// package com.company;
// package azan_naqvi.hii.hello;//Built_in_package..
package azan_naqvi;//Built_in_package..
/*  A package is used to group related classes Packages help in avoiding name conflicts..
There are 2 types of packages:-
1)Built in Packages ->Java API..
2)User defined Packages ->Custom packages..
*/
/*In command prompt/vs code command prompt to run java program
javac labpt_14_insertionsort.java //make byte code of the corresponding java program..
java labpt_14_insertionsort //run that java program..
javac -d . *.java//merge the package of the corresponding java files/programs..
javac -d . labpt_14_insertionsort.java//merge the package of labpt_14_insertionsort file..
javac -d abc *.java//merge the package of the corresponding java files/programs and put all files in the abc folder..
//if you place . instead of abc than package will be and no abc file will be created..
*/
import java.util.Scanner;
public class Matrix_Mul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of matrix 1");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("enter the length of matrix 2");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int [][]m1=new int[m][n];
        int [][]m2=new int[p][q];
        int [][]mul=new int[m][q];
        if(n==p) {
            System.out.println("Enter the Elements of Matrix 1:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("m1[%d][%d]=", i, j);
                    m1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the Elements of Matrix 2:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.printf("m2[%d][%d]=", i, j);
                    m2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matrix 1 is:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix 2 is:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(m2[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < n; k++)
                        mul[i][j] += m1[i][k] * m2[k][j];
                }
            }
            System.out.println("Product of Matrix 1 and 2 is:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }

        }
        else {
            System.out.println("Matrix Multiplication not possible");
        }
    }
}
