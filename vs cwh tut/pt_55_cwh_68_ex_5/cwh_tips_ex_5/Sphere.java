/*Exercise 5:
You have to create a package named com.codeWithharry.shape..
This package should have individual classes for Rectangle,Square,Circle,Cylinder,Sphere..
These classes should use inheritance to properly manage the code!..
Include methods like volume ,surface area and getters/setters for dimensions..
// 2:*/
package com.codeWithnaqvi.shape;
//package com.company;
class Sphere extends Circle{
    private float r;
    Sphere(float r)
    {
        super(r);
        this.r=r;
    }
    public void volume()
    {
        super.perimeter();
        System.out.println("Volume of Sphere is "+(4/3*Math.PI*r*r*r));
    }
    @Override
    public void area()
    {
        super.area();
        System.out.println("Area of Sphere is "+(4*Math.PI*r*r));
    }
}