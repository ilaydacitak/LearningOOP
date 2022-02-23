/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createtringle;

import static java.lang.Math.sqrt;

/**
 *
 * @author hp
 */
public class Triangle extends GeometricObject{
    private double side1;
    private double side2 ;
    private double side3 ;

    public Triangle() {
    side1=1.0;
    side2=1.0 ;
    side3=1.0 ;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    public double getArea (double kenar1 ,double kenar2 , double kenar3){
        double s = (kenar1+kenar2+kenar3)/2 ;
        double area = (double) sqrt (s * (s-kenar1) * (s-kenar2) * (s-kenar3)) ;
        return area ;
    }
    
    public double getPerimeter(double kenar1 ,double kenar2 , double kenar3){
        return kenar1+kenar2+kenar3 ;
    }
    
    @Override
    public String toString() {
    return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
           + " Side 3 = " + side3;
    }

}


