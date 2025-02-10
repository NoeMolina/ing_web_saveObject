/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregacion;

import java.io.Serializable;

/**
 *
 * @author soule
 */
public class Zoologico implements Serializable {

    //private Animal[] animales;
    private Animal a1, a2, a3, a4;
    private String nombre;

    public Zoologico(String nombre, Animal a1, Animal a2, Animal a3, Animal a4) {
        this.nombre = nombre;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

//    public Animal[] getAnimales() {
//        return animales;
//    }
//
//    public void setAnimales(Animal[] animales) {
//        this.animales = animales;
//    }
    public String getName() {
        return nombre;
    }

    public String toString() {
        return "Nombre: " + nombre + " Animales: " + a1.getNombre() + " " + a2.getNombre() + " " + a3.getNombre() + " " + a4.getNombre();
    }

}
