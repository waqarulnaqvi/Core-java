/*Exercise 5:
You have to create a package named com.codeWithharry.shape..
This package should have individual classes for Rectangle,Square,Circle,Cylinder,Sphere..
These classes should use inheritance to properly manage the code!..
Include methods like volume ,surface area and getters/setters for dimensions..
// 3:*/
package com.codeWithnaqvi.shape;
//package com.company;
class square extends Sphere {
    private float l;
    square(float l)
    {
        super(l);
        this.l=l;
    }
    @Override
    public void volume()
    {
        super.volume();
        System.out.println("Volume of Square is "+(l*l*l));
    }
    @Override
    public void area()
    {
        super.area();
        System.out.println("Area of Square is "+(l*l));
    }
}