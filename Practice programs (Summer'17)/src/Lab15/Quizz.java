/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab15;

/**
 *
 * @author peyash
 */
public class Quizz {
    private String id;
    private float mark;
    
    public Quizz(){
        
    }
    
    public Quizz(String id, float mark){
        this.id = id;
        this.mark = mark;
    }
    
    //setters
    public void setId(String id){
        this.id = id;
    }
    
    public void setMark(float mark){
        this.mark = mark;
    }
    
    //getters
    public String getId(){
        return id;
    }
    
    public float getMark(){
        return mark;
    }
    
    @Override
    public String toString(){
        return "ID: "+id+"\n"+"Mark: "+mark;
    }
    
}
