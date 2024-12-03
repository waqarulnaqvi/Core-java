package ch12.protected_vs_default;
import ch12.sortmessage.problem2;
import java.util.*;

class ch12 extends problem2
{
   @Override
  public void meth1(){//Overriden method must be public access modifier in both base class and child class..
      System.out.println("The value of public x = "+x);//Run..
      System.out.println("The value of protected y = "+y);//Run..
      // System.out.println("The value of default z = "+z);//default access modifier throws an error..
      // System.out.println("The value of private a = "+a);//private access modifier throws an error..
     }
}
public class problem4{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ch12 o =new ch12();
    o.meth1();
    o.hello_world();//imported method from the problem2 program with the help of (ch12.sortmessage.problem2) package..
   }
}