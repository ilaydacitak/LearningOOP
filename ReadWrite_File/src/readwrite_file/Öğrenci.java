/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite_file;

/**
 *
 * @author hp
 */
public class Öğrenci {
    private String adi ;
    private String soyadi ;
    private int dogumYili;
    private String okulNumarasi ;

    public Öğrenci() {
        
        this.adi="";
        this.soyadi="";
        this.dogumYili=0;
        this.okulNumarasi="";
    }

    public Öğrenci(String adi, String soyadi, int dogumYili, String okulNumarasi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.dogumYili = dogumYili;
        this.okulNumarasi = okulNumarasi;
    }

    public String getAdi() {
        return adi;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public String getOkulNumarasi() {
        return okulNumarasi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public void setOkulNumarasi(String okulNumarasi) {
        this.okulNumarasi = okulNumarasi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    @Override
    public String toString() {
        return "ÖĞRENCİ = ADI: "+adi+"SOYADI: "+soyadi+"DOĞUM YILI: "+dogumYili+"OKUL NUMARASI: "+okulNumarasi;
    }
    
    
    
}
