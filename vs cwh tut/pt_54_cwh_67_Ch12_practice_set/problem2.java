package ch12.sortmessage;
import java.util.Scanner;
public class problem2 {
    public int x=5;
    protected int y=45;
    int z = 6;//default access modifier..
    private int a =78;
    public void meth1()//Overriden method must be public access modifier in both base class and child class..
    {//this method is overriden in problem4
        //Try to print the value of all type of access modifier inside the same class:-
        System.out.println("The value of public x = "+x);//Run..
        System.out.println("The value of protected y = "+y);//Run..
        System.out.println("The value of default z = "+z);//Run..
        System.out.println("The value of private a = "+a);//Run..
    }
    public void hello_world()
    {
        System.out.println("printing hello world in problem2 Hello World");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number 1:");
    int m=sc.nextInt();
    System.out.println("Enter a number 2:");
    int n=sc.nextInt();
    if (m==n)
    {
        System.out.println("By using sort");
    }
    }
}
