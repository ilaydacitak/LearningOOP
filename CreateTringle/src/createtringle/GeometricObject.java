/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createtringle;

/**
 *
 * @author hp
 */
public class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
    }

    public GeometricObject(String color , boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "Created on " + "\n color: " + color + " and filled " + filled;                 
    }   
    
    
}
