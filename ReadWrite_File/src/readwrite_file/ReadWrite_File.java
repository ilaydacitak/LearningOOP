/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readwrite_file;

/**
 *
 * @author mrsci
 */
public class ReadWrite_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Öğrenci öğrenci1 = new Öğrenci("İLAYDA","ÇITAK",1999, "180315034");
        
        Öğrenci öğrenci2 = new Öğrenci("HANDE","BAŞKIN",1996, "180315041");

        
        DosyaYazma dosyaYazma = new DosyaYazma();
        
        boolean dosyaOlusturmaDurumu = dosyaYazma.dosyaOlustur("ÖĞRENCİLER");
        
        if(dosyaOlusturmaDurumu){
            
            System.out.println("DOSYA OLUŞTURULDU");
        }
        else{
            System.out.println("DOSYA OLUŞTURULAMADI!!!");
        }
        
               
        dosyaYazma.ogrenciyiKaydet(öğrenci1);
        dosyaYazma.ogrenciyiKaydet(öğrenci2);
        
        boolean dosyaAcmaKapamaDurumu = dosyaYazma.dosyaYazmayiKapat();
        
        if(dosyaAcmaKapamaDurumu){
            
            System.out.println("DOSYA KAPATILABİLDİ");
        }
        else{
            System.out.println("DOSYA KAPATILAMADI !!!");
        }
        
        
        //-----------------------------------------------------------------------------------------------------------------//
        
        
        DosyaOkuma dosyaOkuma = new DosyaOkuma();
        
        dosyaOkuma.okunacakDosya("ÖĞRENCİLER");
        dosyaOkuma.dosyaSatırOku();
        dosyaOkuma.okumayiKapat();
    }
    
}
