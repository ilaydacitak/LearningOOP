/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fansetting;

/**
 *
 * @author hp
 */
public class Fan {
    private int speed ;
    private boolean acikapali;
    private double radius ;
    private String color ;
    private int fanSirasi;
    
    public Fan (){
        this.speed = 1 ;
        this.acikapali = true ;
        this.radius = 5;
        this.color = "mavi" ;
        this.fanSirasi= 0;
    }
    
    public Fan (int speed , boolean acikapali , double radius , String color , int fanSirasi){
        this.speed = speed;
        this.acikapali = acikapali;
        this.radius = radius;
        this.color = color ;
        this.fanSirasi= fanSirasi;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed (int speed){
        this.speed = speed ;
    }
    
    public boolean getAcikapali(){
        return acikapali;
    }
    
    public void setAcikapali( boolean acikapali){
        this.acikapali = acikapali;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius( double radius){
        this.radius= radius;
    }
    public String getColor(){
        return color ;
    }
    
    public void setColor(String color){
        this.color = color ;
    }
    
    public int getFanSirasi(){
        return fanSirasi;
    }

    @Override
    public String toString() {
        return "HIZI: "+speed+"RENK: "+color+"YARIÇAP: "+radius;
    }
    
    
    
}
