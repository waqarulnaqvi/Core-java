package com.company;
public class pt_53_cwh_66_access_modifier { 
    public int x=5;
    protected int y=45;
    int z = 6;//default access modifier..
    private int a =78;
    public void meth1()
    {
        //Try to print the value of all type of access modifier inside the same class:-
        System.out.println("The value of public x = "+x);//Run..
        System.out.println("The value of protected y = "+y);//Run..
        System.out.println("The value of default z = "+z);//Run..
        System.out.println("The value of private a = "+a);//Run..
    }
    public static void main(String[] args) {
    //  pt_53_cwh_66_access_modifier obj =new pt_53_cwh_66_access_modifier();
    // obj.meth1();
        
        // Try to print the value of all type of access modifier inside the same package:-
    //     System.out.println("The value of public x = "+obj.x);//Run..
    //     System.out.println("The value of protected y = "+obj.y);//Run..
    //     System.out.println("The value of default z = "+obj.z);//Run..
    //    System.out.println("The value of private a = "+obj.a);//private access modifier throws an error..
     System.out.println("Hello duniya");
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