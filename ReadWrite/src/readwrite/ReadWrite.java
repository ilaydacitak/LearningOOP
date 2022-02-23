/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readwrite;

/**
 *
 * @author mrsci
 */
public class ReadWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericMemoryCell m_str = new GenericMemoryCell();
        GenericMemoryCell m_int = new GenericMemoryCell();
        
        String myStr = "String Value";
        Integer myInt = 25;
        
        m_str.write(myStr);
        m_int.write(myInt);
        
        System.out.println(m_str.read());
        System.out.println(m_int.read());
    }
    
}
