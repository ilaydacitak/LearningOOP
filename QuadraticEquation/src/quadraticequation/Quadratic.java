/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quadraticequation;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author mrsci
 */
public class Quadratic {
    private double a ;
    private double b;
    private double c ;
    
    public Quadratic (){
        
    }
    
    public Quadratic(double a , double b , double c ){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a=a;
    }
    
    public double getB(){
        return b ;
    }
    public void setB(double b){
        this.b=b;
    }
    
    public double getC(){
        return c ;
    }
    public void setC(double c ){
        this.c=c;
    }
    
    public double getDiscriminant(double a , double b ,double c){
        double delta = (double) (pow(b,2)-4*a*c);
        return delta;
    }
    
    public double getRoot1(double b , double delta , double a ){
        return (- b + (double)sqrt(delta))/(2*a);
    }
    
    public double getRoot2(double b , double delta , double a ){
        return (- b - (double)sqrt(delta))/(2*a);
    }
}
