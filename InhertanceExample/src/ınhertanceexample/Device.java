/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınhertanceexample;

/**
 *
 * @author hp
 */
public class Device {
    private boolean hasBattery ;
    private double weight ;
    private double height ; 
    private double width ;
    private double depth ;
    
    public Device (boolean hasBattery , double weight , double height , double witdth , double depth){
        this.hasBattery = hasBattery ;
        this.weight = weight ;
        this.height = height ;
        this.width = witdth ;
        this.depth = depth ;
        
    }
    public double getVolume(){
        return this.width * this.depth * this.height ;
    }
    public boolean getHasBattery(){
        return this.hasBattery ;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWitdth(){
        return this.width;
    }
    public double getDepth(){
        return this.depth ;
    }
    public String getDeviceType(){
        return "Normal Type";
    }
    
}
