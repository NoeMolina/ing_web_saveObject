/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
}
