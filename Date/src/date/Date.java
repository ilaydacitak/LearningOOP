/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package date;

import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyDate md = new MyDate();

        Scanner input = new Scanner(System.in);
        System.out.println("BUGÜNÜN TARİHİNİ GİRİNİZ: ");
        int gün = input.nextInt();
        int ay = input.nextInt();
        int yıl = input.nextInt();
        
        md.setAy(ay);
        md.setGün(gün);
        md.setYıl(yıl);
        
        System.out.println("BUGÜN: "+md.getGün()+"/"+md.getAy()+"/"+md.getYıl());
        
        System.out.println("ŞİMDİKİ ZAMANA EKLEMEK İSTEDĞİNİZ GÜNÜ GİRİNİZ: ");
        long elapsedTime = input.nextLong();
        
        md.setDate(elapsedTime);
        
        Scanner inputt = new Scanner(System.in);
        System.out.println("MİLİSANİYE GİRİNİZ: " );
        long mills = inputt.nextLong() ;
        
        java.util.Date gcal = new java.util.Date(mills);
        System.out.println("MİLİSANİYE CİNSİNDEN: "+gcal);
    }
    
}
