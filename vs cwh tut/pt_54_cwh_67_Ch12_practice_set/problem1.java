package ch12.Calculator;
import java.util.*;
class Calculator
{ 
    private  int a,b;
    Calculator(int a , int b)
    {
        this.a=a;
        this.b=b;
    }
void sum (){
    System.out.println("Sum of 2 number  in Simple Calculator = "+(a+b));
}
void substract (){
    System.out.println("Substraction of 2 number in Simple MulCalculator = "+(a-b)+"\n");
}
}
class ScCalculator extends Calculator
{
    private  int a,b;
    ScCalculator(int a , int b)
    {
        super(a, b);
        super.sum();
        super.substract();
        this.a=a;
        this.b=b;
    }
void mul (){
    System.out.println("Multiplication of 2 number  in Scientific_Calculator = "+(a*b));
}
void div (){
    System.out.println("Division of 2 number in Scientific_Calculator = "+(a/b)+"\n");
}
}
class HybridCalculator extends ScCalculator{
    private  int a,b;
    HybridCalculator(int a , int b)
    {
        super(a, b);
        super.mul();
        super.div();
        this.a=a;
        this.b=b;
    }
    @Override
    void sum (){
        // super.sum();
        System.out.println("Sin Sum of 2 number  in Hybrid_Calculator = "+Math.sin(a+b));
    }
    @Override
    void substract (){
        // super.substract();
        System.out.println("Sin Substraction of 2 number in Hybrid_Calculator = "+Math.sin(a-b));
    }
    @Override
    void mul (){
        // super.mul();
        System.out.println("Sin Multiplication of 2 number  in Hybrid_Calculator = "+Math.sin(a*b));
    }
    @Override
    void div (){
        // super.div();
        System.out.println("Sin Division of 2 number in Hybrid_Calculator = "+Math.sin(a/b));
    }

}
public class problem1
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int m=sc.nextInt();
        System.out.println("Enter a number 2:");
        int n=sc.nextInt();
        HybridCalculator ob =new HybridCalculator(m, n);
        ob.sum();
        ob.substract();
        ob.mul();
        ob.div();
    }
}