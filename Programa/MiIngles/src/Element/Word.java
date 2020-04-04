/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Element;

/**
 *
 * @author netbook
 */
public class Word {
   
    int id ;
    boolean tipoDePalabra ; //para ver de forma rapida si es un verbo
    String nombreInfinitivo ;
    String pronunciacion;
    String significado;
    String observaaciones;
    
    public Word(){
        this.nombreInfinitivo ="";
        this.observaaciones ="";
        this.pronunciacion ="";
        this.significado="";
        this.tipoDePalabra=false;
    }
    
    public Word(String nombre, String pronunciacion, 
            String significado , String observaciones,
            boolean tipoDePalabra)
    {
        this.nombreInfinitivo = nombre;
        this.observaaciones = observaciones;
        this.pronunciacion = pronunciacion;
        this.significado = significado;
        this.tipoDePalabra =tipoDePalabra;
        
    }
    
    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombreInfinitivo;
    }

    public String getPronunciacion() {
        return pronunciacion;
    }

    public String getSignificado() {
        return significado;
    }

    public String getObservaaciones() {
        return observaaciones;
    }
    
    public boolean getTipodePalabra() {
        return tipoDePalabra;
    }
    
    public void setId(int id){
        this.id = id ;
    }

    public void setNombre(String nombreInfinitivo) {
        this.nombreInfinitivo = nombreInfinitivo;
    }

    public void setPronunciacion(String pronunciacion) {
        this.pronunciacion = pronunciacion;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public void setObservaaciones(String observaaciones) {
        this.observaaciones = observaaciones;
    }
    
    public void setTipodePalabra(boolean tipoDePalabra) {
        this.tipoDePalabra = tipoDePalabra;
    }
    
    public String getPalabraEncontrada (int valor){
        return ("/n --> ID :  -"+ valor+
                "/n --> NOMBRE :  -"+ getNombre()+
                "/n --> PRONUNCIACION :  -"+ getPronunciacion()+
                "/n --> SIGNIFICADO :  -"+ getSignificado()+
                "/n --> OBSERVACIONES :  -"+ getObservaaciones());
    }
}
