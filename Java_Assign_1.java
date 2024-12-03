//Name:Syed Waqarul Hasan Naqvi
//Enroll:1900102580
//Question 5.Write a Program to java find the sum of series 1+2+3+4+..+n.
// package com.company1;//Built_in_package..
// package azan_naqvi.hii.hello;//Built_in_package..
/*  A package is used to group related classes Packages help in avoiding name conflicts..
There are 2 types of packages:-
1)Built in Packages ->Java API..
2)User defined Packages ->Custom packages..
*/
package azan_naqvi;//Built_in_package..
/*In command prompt/vs code command prompt to run java program
javac labpt_14_insertionsort.java //make byte code of the corresponding java program..
java labpt_14_insertionsort //run that java program..
javac -d . *.java//merge the package of the corresponding java files/programs..
javac -d . labpt_14_insertionsort.java//merge the package of labpt_14_insertionsort file..
javac -d abc *.java//merge the package of the corresponding java files/programs and put all files in the abc folder..
//if you place . instead of abc than package will be and no abc file will be created..
*/
import java.util.Scanner;
class  SumofSeries {
   public void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum of n series is "+sum);
    }
}
public class Java_Assign_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an n number:");
        int n = sc.nextInt();
        SumofSeries ob = new SumofSeries();
      ob.sum(n);
    }
}


// Name:Syed Waqarul Hasan Naqvi
// Enroll:1900102580
// Question 6.Write a Program to find the largest of three numbers.
// import java.util.Scanner;
// class Largest{
//     void findlarge(int a,int b,int c)
//     {
//         if(a>b&&a>c){
//             System.out.println(a+" is largest");
//         }
//         else if (b>a&&b>c){
//             System.out.println(b+" is largest");
//         }
//         else {
//             System.out.println(c+" is largest");
//         }
//     }
// }
// public class java_assign_1or2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 3 numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         Largest l = new Largest();
//         l.findlarge(a, b, c);

//     }
// }


// //Method:1(find largest with 1 for loop)
// package com.company;
// public class selfpt_21_sortwithoneforloop {
//     public static void main(String[] args) {
//        int a[]={2,6,3,4,5,7,6,34,1};
//         int num=0;
//         for(int i=0;i<a.length;i++) {
//             System.out.print(a[i] + " ");
//             if (i != a.length - 1) {
//                 if (a[i] > a[i + 1]) {
//                     num = a[i + 1];
//                 }
//             }
//         }
//         System.out.println("\nSmallest number is:"+num);
//     }
// }

//Method:2(find largest with 1 for loop)
// package azan_naqvi;//Built_in_package..

// public class selfpt_21_sortwithoneforloop {
//     public static void main(String[] args) {
//         int a[]={2,6,3,4,5,7,6,34,1};
//         int num=0;
//         for(int e:a) {
//             System.out.print(e+" ");
//         }
//         for(int i=0;i<a.length-1;i++) {
//                 if (a[i] > a[i + 1]) {
//                     num = a[i + 1];
//                 }
//             }
//         System.out.println("\nSmallest number is:"+num);
//         }
// }
    