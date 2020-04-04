/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Standar;

import java.util.*;
import Element.Word;
import javax.swing.JOptionPane;


/**
 *
 * @author netbook
 */
public final class TodoUtil {
    
    /*Recorrido del vector para encontrar si existe el resultado, de ser asi 
     devuelve el numero de la posicion del vector donde se encuentra ese valor
    OR de no encontrar el resultado , resulta que no existe y devuelve -1 */
    public static int recorrerArrayList( LinkedList<Word> vector, String palabra){
        int index =-1;
        
        for ( int i=0; i <= vector.size() ; i++){
            
            if (palabra.equals( vector.get(i).getNombre())){
                index = i;
            }
            
        }
        return index ;
        
    }
    
    /* MENU DE EDITAR CAMPOS 
     con su metodo para devolver la respuesta, no contempla que la 
    respuesta no sea un numero */
    
    public static int menuEditar (){
        
        int respuesta;
        
        System.out.println("/n MENU EDITAR"
                        + "/n PRESIONE EL Nº DE LA OPCION DESEADA"
                        + "/n 1 --> EDITAR PRONUNCIACION "
                        + "/n 2 --> EDITAR SIGNIFICADO "
                        + "/n 3 --> EDITAR OBSERVACION "
                        + "/n 0 --> SALIR DEL MENU");
        respuesta=Integer.parseInt( JOptionPane.showInputDialog(null,"Ingrese un numero"));
        
        return respuesta;

    }        
    
    
    
}
