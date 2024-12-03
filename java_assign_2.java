//Name:Syed Waqarul Hasan Naqvi
//Enroll:1900102580
//Question 2.Write a program where interface can be used to support multiple inheritance.import java.util.Scanner;
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
interface Cam{
    String takesnap(String snap);
}
interface wifinet{
    String[] networks();
}
interface netlocation extends wifinet{
    String[] connectionlocation();
}
class Cellphn{
    void callnumber(int num){
        System.out.println("Calling number "+num);
    }
    void pickcall(){
        System.out.println("Connecting..");
    }
}
class Smtphone extends Cellphn implements Cam,netlocation{
   @Override
    public String takesnap(String snap){
        return snap;
    }
   @Override
    public String[] networks(){
       System.out.println("Getting Lists of Network");
       String[] networklist={"jio 4G","airtel","vodaphone"};
       return networklist;
    }
    @Override
    public String[] connectionlocation(){
        System.out.println("\nGetting Lists of Signallocation");
        String[] netloc={"aliganj","aminabad","sahadatganj"};
        return netloc;
    }
}
public class java_assign_2 {
    public static void main(String[] args) {
     Smtphone obj=new Smtphone();
        obj.callnumber(123);
        obj.pickcall();
        String network[] =obj.networks();
        for (String ele:network) {
            System.out.print(ele+" ");
        }
        String loc[]=obj.connectionlocation();
        for (String ele:loc) {
            System.out.print(ele+" ");
        }
        System.out.println(obj.takesnap("Taking your photo.."));
    }
}

