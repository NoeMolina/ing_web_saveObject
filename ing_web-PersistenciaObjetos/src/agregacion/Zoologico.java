/*
NOMBRE: MOLINA LEON NOE MARCELINO
N.CONTROL: 20170752
MATERIA: INGENIERIA WEB
TEMA: PERSISTENCIA DE OBJETOS CON AGREGACION y COMPOSICION
FECHA: 10/02/2025
DOCENTE: DR.CLEMENTE GARCIA GERARDO
*/
package agregacion;

import java.io.Serializable;

/**
 *
 * @author soule
 */
public class Zoologico implements Serializable {

    private Animal a1, a2, a3;
    private String nombre;

    public Zoologico(String nombre, Animal a1, Animal a2, Animal a3) {
        this.nombre = nombre;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public String getName() {
        return nombre;
    }

    public String toString() {
        return "Nombre: " + nombre + " Animales: " + a1.getNombre() + " " + a2.getNombre() + " " + a3.getNombre();
    }

}
