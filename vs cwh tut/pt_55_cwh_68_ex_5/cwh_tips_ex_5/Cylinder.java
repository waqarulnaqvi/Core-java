/*Exercise 5:
You have to create a package named com.codeWithharry.shape..
This package should have individual classes for Rectangle,Square,Circle,Cylinder,Sphere..
These classes should use inheritance to properly manage the code!..
Include methods like volume ,surface area and getters/setters for dimensions..
// 4:*/
package com.codeWithnaqvi.shape;
//package com.company;
class Cylinder extends square{
    private float r,h;
    Cylinder(float r,float h)
    {
        super(r);
        this.r=r;
        this.h=h;
    }
    @Override
    public void volume()
    {super.volume();
        System.out.println("Volume of Cylinder is "+(Math.PI*r*r*h));
    }
    @Override
    public void area()
    {
        super.area();
        System.out.println("Area of Cylinder is "+(2*Math.PI*r*(r+h)));
    }
}