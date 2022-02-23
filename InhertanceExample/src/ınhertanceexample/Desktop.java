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
public class Desktop extends Device {
    private double cpuHz ;
    private String os ;
    private double storage ;
    private String macAddress ;
    
    public Desktop(boolean hasBattery, double weight, double height, double witdth, double depth , double cpuHz , double storage , String os , String macAddress) {
        super(hasBattery, weight, height, witdth, depth);
        
        this.cpuHz = cpuHz ;
        this.macAddress = macAddress ;
        this.os = os ;
        this.storage = storage ;
    }
    public double getCpuHz (){
        return this.cpuHz;
    }
    public double getStorage (){
        return this.storage;
    }
    public String getOs (){
        return this.os;
    }    
    public String getMacAddress (){
        return this.macAddress;
    }
    @Override
    public String getDeviceType(){
        return "Computer";
    }
}
