/*Exercise 5:
You have to create a package named com.codeWithharry.shape..
This package should have individual classes for Rectangle,Square,Circle,Cylinder,Sphere..
These classes should use inheritance to properly manage the code!..
Include methods like volume ,surface area and getters/setters for dimensions..
// 5:*/
package com.codeWithnaqvi.shape;
//package com.company;
import java.util.*;
class Rectangle extends Cylinder{
    private float l,b,h;
    Rectangle(float l,float b,float h)
    {
        super(l, h);
        this.l=l;
        this.b=b;
        this.h=h;
    }
    @Override
    public void volume()
    {
        super.volume();
        System.out.println("Volume of Rectangle is "+(l*b*h));
    }
    @Override
    public void area()
    {
        super.area();
        System.out.println("Area of Rectangle is "+(l*b));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number length or radius or side:");
        float l=sc.nextFloat();
        System.out.println("Enter a number breadth:");
        float b=sc.nextFloat();
        System.out.println("Enter a number height:");
        float h=sc.nextFloat();
        Rectangle obj=new Rectangle(l,b,h);
        obj.volume();
        obj.area();
    }
}