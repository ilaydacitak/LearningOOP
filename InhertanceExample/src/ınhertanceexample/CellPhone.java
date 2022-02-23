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
public class CellPhone extends Phone {
    private double cameraMP ;
    private String os ;
    private boolean hasBluetooth ;
    private String imeiNumber ;
    private double batteryAmper ;
    public CellPhone(boolean hasBattery, double weight, double height, double witdth, double depth, long phoneNumber, double camre , String os, boolean hasBluetooth, String imeiNumber, double batteryAmper ) {
        super(hasBattery, weight, height, witdth, depth, phoneNumber);
        
        this.batteryAmper = batteryAmper ;
        this.cameraMP = cameraMP ;
        this.hasBluetooth = hasBluetooth ;
        this.imeiNumber = imeiNumber ;
        this.os = os ;
    }
    
    public double getCameraMP(){
        return this.cameraMP ;
    }
    public String getOs (){
        return this.os;
    }
    public boolean getHasBluetooth(){
        return this.hasBluetooth;
    }
    public String getImeiNumber(){
        return this.imeiNumber ;
    }
    public double getBatteryAmper(){
        return this.batteryAmper;
    }
}
