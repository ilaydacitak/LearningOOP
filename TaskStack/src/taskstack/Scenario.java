/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskstack;;

/**
 *
 * @author hp
 */
public class Scenario {
    public static void main(String[] args) {
        TaskStack ts = new TaskStack(10);
        ts.push(new Tasks("Lesson 1",'1'));
        char c [] = {'O','O','P'};
        ts.push (new Tasks(c));
        System.out.println(ts.pop());
        String val = ts.pop() ;
        System.out.println(val);
        ts.push(new Tasks(val,0,val.length()-1));
        System.out.println(ts.pop());
    }
}
