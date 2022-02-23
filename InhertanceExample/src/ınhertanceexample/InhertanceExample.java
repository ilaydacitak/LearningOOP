/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ınhertanceexample;

/**
 *
 * @author mrsci
 */
public class InhertanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Device d = new Device(true,20,20,20,20);
        Desktop desk = new Desktop (false,10,10,10,10,15,3.2,"Windows","EDCB:120");
        Phone p = new Phone (false,10,10,15,10,055555);
        Laptop l = new Laptop (false,10,10,10,10,15,3.2,"Windows","EDCB:120",120);
        CellPhone cp = new CellPhone (false,10,10,15,10,055555,2.0,"IOS",false,"sdasdas",120);
        System.out.println("Device:"+d.getDeviceType());
        System.out.println("Desktop:"+desk.getDeviceType());
        System.out.println("Laptop:"+l.getDeviceType());
        System.out.println("Phone:"+p.getDeviceType());
        System.out.println("CellPhone:"+cp.getDeviceType());
    }
    
}
