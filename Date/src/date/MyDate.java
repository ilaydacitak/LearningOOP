/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.util.Calendar;



/**
 *
 * @author hp
 */
public class MyDate {
    private int yıl ;
    private int ay ;
    private int gün ;

    public MyDate() {
    }

    public MyDate(int yıl, int ay, int gün) {
        this.yıl = yıl;
        this.ay = ay;
        this.gün = gün;
    }
      
    public int getYıl(){
        return yıl ;
    }
    
    public int getAy(){
        return ay;
    }

    public int getGün() {
        return gün;
    }

    public void setYıl(int yıl) {
        this.yıl = yıl;
    }

    public void setAy(int ay) {
        this.ay = ay;
    }

    public void setGün(int gün) {
        this.gün = gün;
    }
    
    public void setDate(long elapsedTime){
        int eklenecekYıl = (int) (elapsedTime/365) ;
        int eklenecekAy = (int) (elapsedTime%365)/30;
        int eklenecekGün = (int) ((elapsedTime%365)%30);
        
        this.yıl = yıl+eklenecekYıl ;
        this.ay = ay+eklenecekAy;
        this.gün = gün+eklenecekGün;
        
        System.out.println("TARİH: "+gün+"/"+ay+"/"+yıl);
    }

}

