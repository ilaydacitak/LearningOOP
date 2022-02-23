/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package createtringle;

import java.util.Scanner;

/**
 *
 * @author mrsci
 */
public class CreateTringle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        System.out.println("OLUŞTURMAK İSTEDĞİNİZ ÜÇGENİN KENAR ÖLÇÜLERİNİ SIRAYLA GİRİNİZ: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        
        Triangle triangle = new Triangle(side1, side2, side3);
        
        double alan = triangle.getArea(side1, side2, side3);
        double çevre = triangle.getPerimeter(side1,side2 , side3);
        
        System.out.println("ÜÇGENİN RENGİNİ GİRİNİZ: ");
        String color = input.next();
        
        
        System.out.println("DOLU MU?");
        boolean filled = input.nextBoolean();
        
        GeometricObject go = new GeometricObject(color, filled);
        
        
        System.out.println("ÜÇGENİN KENARLARI: "+triangle);
        System.out.println("RENGİ VE DOLULUK DURUMU: "+go);
        System.out.println("ALANI: "+alan);
        System.out.println("ÇEVRE: "+çevre);
    }
    
}
