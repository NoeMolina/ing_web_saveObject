/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ing_web.persistenciaobjetos;

import agregacion.Animal;
import agregacion.Zoologico;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Random;


/*
Notas:
cuando un objeto se almacena con serializable, todos los objetos involucrados
deben de implementar dicha interfaz

cuando se escriben objetos usando ouputStream, se deben de almacenar todos a la vez,
si no se realiza lo anterior el archivo se corrompe.
 */
public class Ing_webPersistenciaObjetos {

    static void escribirAutos() {
        boolean fileExists = new File("Autos.txt").exists();
        Random r = new Random();
        try {

            OutputStream writer = new FileOutputStream("Autos.txt");
            ObjectOutputStream obWriter = new ObjectOutputStream(writer);

            for (int i = 0; i < 10; i++) {
                String numSerie = Integer.toString(r.nextInt(10));
                Auto auto = new Auto(numSerie, numSerie, numSerie);
                obWriter.writeObject(auto);
            }
        } catch (Exception e) {
            System.out.println("Error al guardar el Objeto" + e);
        }
    }

    static void leerAutos() {
        boolean cont = true;
        try {
            InputStream reader = new FileInputStream("Autos.txt");
            ObjectInputStream obReader = new ObjectInputStream(reader);

            while (cont) {
                Auto auto = (Auto) obReader.readObject();
                if (auto != null) {
                    System.out.println(auto.toString());
                } else {
                    cont = false;
                }
            }

        } catch (Exception e) {
            System.out.println("Error al recuperar el Objeto " + e);
        }

    }

    static void escribirZoologico() {
        Animal a1 = new Animal("Leon");
        Animal a2 = new Animal("Elefante");
        Animal a3 = new Animal("Jirafa");
        Animal a4 = new Animal("hipopotamos");

        Zoologico zoo = new Zoologico("chapultepec", a1, a2, a3, a4);

        System.out.println(zoo.toString());
        try {

            OutputStream writer = new FileOutputStream("Zoologico.txt");
            ObjectOutputStream obWriter = new ObjectOutputStream(writer);
            obWriter.writeObject(zoo);

        } catch (Exception e) {
            System.out.println("Error al guardar el Objeto" + e);
        }

    }

    static void leerZoologico() {
        try {
            InputStream reader = new FileInputStream("Zoologico.txt");
            ObjectInputStream obReader = new ObjectInputStream(reader);

            Zoologico zoo = (Zoologico) obReader.readObject();

            System.out.println(zoo.toString());

        } catch (Exception e) {
            System.out.println("Error al recuperar el Objeto " + e);
        }
    }

    public static void main(String[] args) {
        //Escribir autos
//        Random r = new Random();
//        for (int i = 0; i < 10; i++) {
//            escribirAutos(Integer.toString(r.nextInt(10)));
//        }
//        escribirAutos();
        //leer autos;
//        leerAutos();

        escribirZoologico();

        leerZoologico();
    }

}
