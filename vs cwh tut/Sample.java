import com.company.pt_53_cwh_66_access_modifier;
class using extends pt_53_cwh_66_access_modifier{
   void meth2(){
    System.out.println("The value of public x = "+x);//Run..
    System.out.println("The value of protected y = "+y);//Run..
    // System.out.println("The value of default z = "+z);//default access modifier throws an error..
    // System.out.println("The value of private a = "+a);//private access modifier throws an error..
   }
}
public class Sample {
  public static void main(String[] args) {

     //you are in different package/world:-
    pt_53_cwh_66_access_modifier obj =new pt_53_cwh_66_access_modifier();
     System.out.println("The value of public x = "+obj.x);//Run..
    // System.out.println("The value of protected y = "+obj.y);//protected access modifier throws an error..
    // System.out.println("The value of default z = "+obj.z);//default access modifier throws an error..
    //    System.out.println("The value of private a = "+obj.a);//private access modifier throws an error..
 
      //sub class means different package extend it to a sub class than use otherwise it will throw an error..
    using ob=new using();
    ob.meth2();
      
    /*
  Modifier      class   package  subclass  world
  public         y       y         y        y
  protected      y       y         y        n
  Default(no)    y       y         n        n
  private        y       n         n        n
  //sub class means different package extend it to a sub class than use otherwise it will throw an error..
     */
}
}