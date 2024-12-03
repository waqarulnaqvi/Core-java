// package waqarul_naqvi.bye.kahallo.challo.ihi;//User defined package..
// the package file will be created in the ihi which is in the challo which is in the kahalllo which is in the bye which is in the waqarul_naqvi..
package waqarul_naqvi;//User defined package..
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
import java.util.Scanner;//Built_in_package..
public class labpt_14_insertionsort {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Elements of an array:");
        int []a=new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("a[%d]=",i);
            a[i]= sc.nextInt();
        }
        System.out.println("Original array:");
        for (int ele:a) {
            System.out.print(ele+" ");
        }
       for (int i=1;i<5;i++) {
           int key = a[i];
           int j = i - 1;
           while (j >= 0 && a[j] > key) {
               a[j + 1] = a[j];
               j = j - 1;
           }
           a[j + 1] = key;
       }
        System.out.println("\nAfter Sorting");
        for (int ele:a) {
            System.out.print(ele+" ");
        }
        }
       }
