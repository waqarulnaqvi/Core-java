// package waqarul_naqvi.bye.kahallo.challo.ihi;//User defined package..
// the package file will be created in the ihi which is in the challo which is in the kahalllo which is in the bye which is in the waqarul_naqvi..
// package waqarul naqvi;//Giving space between the package name throws an error..
package waqarul_naqvi;//User defined package..
// package waqarul9naqvi;//User defined package..
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
public class Del_Dub_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={2,3,4,2,3,1};
        for(int i=0;i<a.length;i++)
        {
            for (int j = 0; j <a.length-1 ; j++) {
                if(i!=j&&a[i]==a[j]&&i<j)
                {
                    for (int k = j; k < a.length-1; k++) {
                        a[k]=a[k+1];
                    }
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            {
                System.out.print(a[i]+" ");
                if(a[i]==a[i+1])
                {
                    break;
                }

        }
        }
    }
}
