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

public class Auto implements Serializable{
    private Motor motor;
    private boolean encendido;
    private String Marca;
    private String Modelo;
    private String Placas;
    
    public Auto(String Marca, String Modelo, String Placas){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Placas = Placas;
        this.motor = new Motor(Placas);
    }

    @Override
    public String toString() {
        return ("Auto con placas "+ this.Placas + "con motor "+ motor.getPlacas());
    }
    
    
}
