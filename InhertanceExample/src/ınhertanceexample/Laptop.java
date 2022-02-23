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
public class Laptop extends Desktop {
    private double batteryAmper ;
    
    public Laptop(boolean hasBattery, double weight, double height, double witdth, double depth, double cpuHz, double storage, String os, String macAddress, double batteryAmper) {
        super(hasBattery, weight, height, witdth, depth, cpuHz, storage, os, macAddress);
        
        this.batteryAmper = batteryAmper ;
    }

    public double getBatteryAmper(){
        return this.batteryAmper;
    }
    
}
