/*
NOMBRE: MOLINA LEON NOE MARCELINO
N.CONTROL: 20170752
MATERIA: INGENIERIA WEB
TEMA: PERSISTENCIA DE OBJETOS CON AGREGACION y COMPOSICION
FECHA: 10/02/2025
DOCENTE: DR.CLEMENTE GARCIA GERARDO
*/
package ing_web.persistenciaobjetos;

import java.io.Serializable;


public class Motor implements Serializable{
    private String numSerie;
    private Boolean puedeEncender;
    
    public Motor(String numSerie){
        this.numSerie = numSerie;
        this.puedeEncender = true;
    }
    
    public boolean puedeEncender(){
        return puedeEncender;
    }
    
    public String getPlacas(){
        return numSerie;
    }
}
