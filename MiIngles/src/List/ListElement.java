/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import java.util.LinkedList;
import Element.*;
import javax.swing.JOptionPane;
import Standar.*;
/**
 *
 * @author netbook
 */
public class ListElement {
    
    String nombre;
    LinkedList<Word> listWord ;
    
    public ListElement(){
        
        listWord= null;
        
    }
    
    public ListElement(String nombre){
        listWord = null;
        this.nombre = nombre;
    }
    
    public void addElement (Word aWord){
        
        int index = -1;
        //BUSCAR SI EXISTE EL ELEMENTO CON EL MISMO NOMBRE
        
        for ( int i=0; i<= listWord.size(); i++){
            if (aWord.getNombre().equals(listWord.get(i).getNombre())){
                index = i;
            }
        }
        if (index == -1){
            
            listWord.add(aWord);
            System.out.println(" La palabra fue agregada sin complicacion.");        
        
        }else{
            System.out.println("Existe un elemento con ese nombre ,busquelo en la seccion"
                    + " correspondiente.");
        }
    }
    
    public void editElement (String nombreBusqueda){
        
        int index = -1 ;
        int respuestaMenu = 0;
        String resp ;
        boolean flag = true;
        
        // BUSQUEDA DEL ELEMENTO A ENCONTRAR //
        
        index = TodoUtil.recorrerArrayList(listWord, nombreBusqueda);
        //NO SE ENCONTRO EL RESULTADO //
        //OR
        // MOSTRAR EL ELEMNTO ENCONTRADDO
        if ( index == -1){
            System.out.println("No se encontro ningun resultado con ese nombre");
        }else{
            
            listWord.get(index).getPalabraEncontrada(listWord.get(index).getId());
            
            
            //MOSTRAR MENU PARA EDITAR//
            
            respuestaMenu = TodoUtil.menuEditar();
            
            
        }
        
        
        
        
        
    }
    
    public String getNombreList (){
        return this.nombre ;
    }
    
    public LinkedList<Word> getListWord(){
        return this.listWord;
    }
    
    public void mostrarAllList (){
        
        for (int i=0; i< listWord.size() ;i++){
            System.out.println("/n"
                    + listWord.get(i).getPalabraEncontrada(i)+
                    "/n");
        }
        System.out.println("Fin de la lista");
    }
}
