/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite_file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class DosyaYazma {
    
    private PrintWriter printWriter;
    
    public boolean dosyaOlustur(String dosyaAdi){
               
        String dosyaYolu = "C:/Users/mrsci/Masaüstü/";
        
        try{
            
            printWriter = new PrintWriter(dosyaYolu + dosyaAdi + ".txt");
            return true;
            
        }
        catch (FileNotFoundException e){
            
            System.err.println("HATA: "+e);
            return false ;
        }
        
        
    }
    
    public void ogrenciyiKaydet (Öğrenci öğrenci){
        
        String adi = öğrenci.getAdi();
        String soyadi = öğrenci.getSoyadi();
        int dogumYili = öğrenci.getDogumYili();
        String okulNumarasi = öğrenci.getOkulNumarasi();
        
        printWriter.println(adi + " " + soyadi + " " + dogumYili + " " + okulNumarasi);
        
    }
    
    public boolean dosyaYazmayiKapat(){
        try {
            
           printWriter.close();
           return true;
           
        }
        catch (Exception e) {
            
            System.err.println("HATA: "+e);
            return false ;
            
        }
        
    }
}
