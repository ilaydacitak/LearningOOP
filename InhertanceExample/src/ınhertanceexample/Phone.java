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
public class Phone extends Device{
    private long phoneNumber ;
    
    public Phone(boolean hasBattery, double weight, double height, double witdth, double depth , long phoneNumber ) {
        super(hasBattery, weight, height, witdth, depth);
        
        this.phoneNumber = phoneNumber ;
    }
    public long getPhoneNumber(){
        return this.phoneNumber ;
    }
    @Override
    public String getDeviceType(){
        return "Phone";
    }
}
