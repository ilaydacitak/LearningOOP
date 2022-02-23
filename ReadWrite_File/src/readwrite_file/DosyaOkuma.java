/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class DosyaOkuma {
    
    private Scanner sc;    
    
    public void okunacakDosya(String dosyaAdi){
        
        String dosyaYolu = "C:/Users/mrsci/Masaüstü/" ;
        
        File file = new File (dosyaYolu + dosyaAdi + ".txt" );
        
        try {
            
            sc = new Scanner(file);
            
        } catch (FileNotFoundException e) {
            
            System.err.println("HATA: "+e);
        }
    }
    
    public void dosyaSatırOku (){
        
        String satir;
        
        while(sc.hasNextLine()){
            
            satir = sc.nextLine();
            System.out.println(satir);
            
        }
    }
    
       public void dosyaKelimeOku (){


        while(sc.hasNext()){

            System.out.println(sc.hasNext());
            
        }
    }
    
    public void okumayiKapat(){
        sc.close();
    }
    
}
