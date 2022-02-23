/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadraticequation;

import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadratic hesaplama = new Quadratic();
        
        Scanner input = new Scanner (System.in);
        System.out.println("AX^2 + BX + C = 0 DENKLEMİNİ SAĞLAMASI İÇİN A B VE C DEGERLERİNİZİ GİRİNİZ: ");
        System.out.print("A DEĞERİ: ");
        double aDegeri = input.nextDouble();
        System.out.print("B DEĞERİ: ");
        double bDegeri = input.nextDouble();
        System.out.print("C DEĞERİ: ");
        double cDegeri = input.nextDouble();
        
        double deltaDegeri = hesaplama.getDiscriminant(aDegeri,bDegeri,cDegeri);
        System.out.println("DELTASI: "+deltaDegeri);
        
        if (deltaDegeri<0){
            System.out.println("BU DENKLEMİN KÖKÜ YOKTUR!");
            
            System.exit(0);
        }
        else if (deltaDegeri==0){
            double kökDegeri1 = hesaplama.getRoot1(bDegeri, deltaDegeri, aDegeri);
            double kökDegeri2 = hesaplama.getRoot2(bDegeri, deltaDegeri, aDegeri);
            
            System.out.println("BİRİNCİ KÖK: "+kökDegeri1);
            System.out.println("İKİNİC KÖK DEĞERİ: "+kökDegeri2);
            System.out.println("GÖRÜLDÜĞÜ ÜZERE İKİ KÖK AYNIDIR. YANİ DENKLEMİN ÇİFT KATLI TEK KÖKÜ VARDIR: "
            +kökDegeri1);
            
            System.exit(0);
            
        }
        else if ( deltaDegeri>0){
            double kökDegeri1 = hesaplama.getRoot1(bDegeri, deltaDegeri, aDegeri);
            double kökDegeri2 = hesaplama.getRoot2(bDegeri, deltaDegeri, aDegeri);
            
            System.out.println("BİRİNCİ KÖK: "+kökDegeri1);
            System.out.println("İKİNİC KÖK DEĞERİ: "+kökDegeri2);
            
            System.exit(0);
        }
    }
    
}
