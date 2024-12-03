/*Exercise 5:
You have to create a package named com.codeWithharry.shape..
This package should have individual classes for Rectangle,Square,Circle,Cylinder,Sphere..
These classes should use inheritance to properly manage the code!..
Include methods like volume ,surface area and getters/setters for dimensions..
// 1:*/
package com.codeWithnaqvi.shape;
//package com.company;
import java.util.*;
class Circle {
    private float r;
    Circle(float r)
    {
        this.r=r;
    }
    public void perimeter()
    {
        System.out.println("perimeter of Circle is "+(2*Math.PI*r));
    }
    public void area()
    {
        // perimeter();
        System.out.println("\nArea of Circle is "+(Math.PI*r*r));
    }
}