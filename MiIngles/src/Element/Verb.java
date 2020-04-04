/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Element;

/**
 * @version 1.0
 * @author Feder
 */
public class Verb extends Word {
    
    int id ;
    String pasadoVerbo ;
    String futuroVerbo ;
    String presenteContinuo ;
    
    
    public Verb (){
        super();
        id=0;
        pasadoVerbo ="";
        futuroVerbo ="";
        presenteContinuo="";
    }
    /*
    *
    */
    public Verb (String nombre, String significado, String observaciones,
            String pronunciacion ,String pasadoVerbo, String futuroVerbo, 
            String presenteContinuo)
    {
        super(nombre, pronunciacion, significado, observaciones, true);
        this.id=0;
        this.futuroVerbo=futuroVerbo;
        this.pasadoVerbo=pasadoVerbo;
        this.presenteContinuo=presenteContinuo;
    }
        
    public String getPasadoVerbo() {
        return pasadoVerbo;
    }

    public void setPasadoVerbo(String pasadoVerbo) {
        this.pasadoVerbo = pasadoVerbo;
    }

    public String getFuturoVerbo() {
        return futuroVerbo;
    }
    

    public void setFuturoVerbo(String futuroVerbo) {
        this.futuroVerbo = futuroVerbo;
    }

    public String getPresenteContinuo() {
        return presenteContinuo;
    }

    public void setPresenteContinuo(String presenteContinuo) {
        this.presenteContinuo = presenteContinuo;
    }
    
    
    @Override
    public String getPalabraEncontrada(int valor){
        return ("/n --> ID :  -"+ valor+
                "/n --> NOMBRE :  -"+ getNombre()+
                "/n --> PAST :  -"+ getPasadoVerbo()+
                "/n --> PRESENT CONT :  -"+ getPresenteContinuo()+
                "/n --> FUTURE :  -"+ getFuturoVerbo()+
                "/n --> PRONUNCIACION :  -"+ getPronunciacion()+
                "/n --> SIGNIFICADO :  -"+ getSignificado()+
                "/n --> OBSERVACIONES :  -"+ getObservaaciones());
    }
    
}
