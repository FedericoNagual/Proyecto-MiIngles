/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Element;

/**
 *
 * @author Federico
 */
import java.util.ArrayList;
import List.ListElement;



public class Dictionary {
    
    int id;
    String nombre ;
    ArrayList<ListElement> dictionary;
    
    public Dictionary (){
        
    }
    
    public Dictionary (String nombre){
        this.nombre=nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
            
}
