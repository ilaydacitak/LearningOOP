/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite;

/**
 *
 * @author hp
 */
public class GenericMemoryCell {

    private Object storedValue;
    
    public Object read()
    {
        return storedValue;
    }
    
    public void write(Object x)
    {
        storedValue = x;
    }
}

