/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskstack;

/**
 *
 * @author hp
 */
public class Tasks {
    private String result ;
    
    public Tasks (String w , char c){
        replaceWord(w, c);
    }
    public Tasks (String w , int index1 , int index2 ){
        subWord(w, index1, index2);
    }
    public Tasks ( char [] c){
        collectWord(c);
    }
    
    public void replaceWord(String w, char c){
        char c1 = w.charAt(0);
        w = w.replace(c1,c);
        this.result = w ;
    }
    public void subWord(String w , int index1 , int index2){
        w = w.substring(index1,index2);
        this.result = w ;
    }
    public void collectWord(char [] c){
        this.result = "";
        for ( int i =0 ; i<c.length ; i++){
            this.result = this.result + c[i];
        }
        
    }
    public String getResult (){
        return this.result;
    }
    public void setResult(String result){
        this.result = result;
    }
}

