/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fansetting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class FanSetting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Fan> f = new ArrayList<Fan>();
        
        int secim = -1 ;
        while (secim != 0){
        
        Scanner input = new Scanner(System.in);
        System.out.println("FAN EKLEMEK İÇİN 1 , FAN BİLGİLERİNİ GÖRMEK İÇİN 2 , FANI AÇIP KAPATRMAK İÇİN 3, "
                + "FAN HIZINI DEĞİŞTİREMK İÇİN 4 ,  ÇIKIŞ İÇİN 0");
        secim = input.nextInt();
        
        if(secim==1){
            
            Scanner inputt = new Scanner (System.in);
            System.out.println("EKLEMEK İSTEDĞİNİZ FANIN ÖZELLİKLERİNİ GİRİNİZ: ");
            System.out.println("HIZI : (SLOW:1 - MEDİUM:2 - FAST:3 ) ");
            int hızSecim = inputt.nextInt();
            System.out.println("YARIÇAPI: ");
            double yaricapSecim = inputt.nextDouble();
            System.out.println("RENK: ");
            String renkSecim= inputt.next();
            
            System.out.println("FAN SIRASI"+f.size());
            int fanSirasi = f.size();
            
            Fan yeniFan = new Fan(hızSecim, false , yaricapSecim, renkSecim, fanSirasi);
            f.add(yeniFan);
            
            
            
        }
        else if (secim==2){
            Scanner inputtt = new Scanner (System.in);
            System.out.println("KAÇ NUMARALI FANIN ÖZELLİKLERİNİ GÖRÜNTÜLEME İSTERSİNİZ: ");
            int fanNumarasi = inputtt.nextInt();
            
            for(int i=0 ; i<f.size(); i++ ){
               if(f.get(i).getFanSirasi()==fanNumarasi && f.get(i).getAcikapali()==true){
                   
                   Fan bilgisiYazdirilacakKisi = f.get(i);
                   
                   System.out.println(" : "+bilgisiYazdirilacakKisi);
                   
                   //System.out.println("HIZI:"+f.get(i).getSpeed());
                   //System.out.println("RENGİ:"+f.get(i).getColor());
                   //System.out.println("YARIÇAPI:"+f.get(i).getRadius());

               }
               else if (f.get(i).getFanSirasi()==fanNumarasi && f.get(i).getAcikapali()==false){
                   
                   Fan bilgisiYazdirilacakKisi = f.get(i);
                   
                   System.out.println(" : "+bilgisiYazdirilacakKisi);
                   
                   //System.out.println("FAN KAPALIDIR.");
                   //System.out.println("RENGİ:"+f.get(i).getColor());
                   //System.out.println("YARIÇAPI:"+f.get(i).getRadius());
               }
            }

            
        }
        else if (secim==3){
            Scanner inputtt = new Scanner (System.in);
            System.out.println("KAÇ NUMARALI FANI AÇIP KAPATMAK İSTERSİNİZ: ");
            int fanAyari = inputtt.nextInt();
            
            for(int i=0 ; i<f.size() ; i++ ){
                if(f.get(i).getFanSirasi()==fanAyari && f.get(i).getAcikapali()==false){
                    System.out.println("FANINIZ KAPALIDIR. AÇILIYOR...");
                    f.get(i).setAcikapali(true);
                }
                else if(f.get(i).getFanSirasi()==fanAyari && f.get(i).getAcikapali() == true){
                    System.out.println("FANINIZ AÇIKTIR. KAPANIYOR...");
                    f.get(i).setAcikapali(false);
                }
            }
        }
        else if(secim==4){
            Scanner inputtt = new Scanner (System.in);
            System.out.println("KAÇ NUMARALI FANIN HIZINI DEĞİŞTİRMEK İSTERSİNİZ: ");
            int fanAyari = inputtt.nextInt();
            
            for(int i=0 ; i<f.size(); i++ ){
                if(f.get(i).getFanSirasi()==fanAyari && f.get(i).getSpeed()==1 ){
                    Scanner inputs = new Scanner (System.in);
                    System.out.println("FANINIZ SLOW SEVİYESİNDEDİR. MEDİUM İÇİN 2 , FAST İÇİN 3 E BASINIZ");
                    int yeniHiz = inputs.nextInt();
                    
                    f.get(i).setSpeed(yeniHiz);
                    
                }
                else if(f.get(i).getFanSirasi()==fanAyari && f.get(i).getSpeed()==2 ){
                    Scanner inputs = new Scanner (System.in);
                    System.out.println("FANINIZ MEDİUM SEVİYESİNDEDİR. SLOW İÇİN 1 , FAST İÇİN 3 E BASINIZ");
                    int yeniHiz = inputs.nextInt();
                    
                    f.get(i).setSpeed(yeniHiz);
                    
                }
                else if(f.get(i).getFanSirasi()==fanAyari && f.get(i).getSpeed()==3 ){
                    Scanner inputs = new Scanner (System.in);
                    System.out.println("FANINIZ FAST SEVİYESİNDEDİR. SLOW İÇİN 1 , MEDİUM İÇİN 2 YE BASINIZ");
                    int yeniHiz = inputs.nextInt();
                    
                    f.get(i).setSpeed(yeniHiz);
                    
                }
            
            }
        }
        else if (secim==0){
            System.out.println("ÇIKIŞ YAPILIYOR...");
            System.exit(0);
        }
        
        
    }
    }
    
}
