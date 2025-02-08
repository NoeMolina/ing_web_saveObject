/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
        this.motor = new Motor();
    }
}
