/*
NOMBRE: MOLINA LEON NOE MARCELINO
N.CONTROL: 20170752
MATERIA: INGENIERIA WEB
TEMA: PERSISTENCIA DE OBJETOS CON AGREGACION y COMPOSICION
FECHA: 10/02/2025
DOCENTE: DR.CLEMENTE GARCIA GERARDO
 */
package ing_web.persistenciaobjetos;

import agregacion.Animal;
import agregacion.Zoologico;
import java.io.EOFException;
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

    static void writeObject(Object obj, String filePath) {
        boolean fileExists = new File(filePath).exists();
        try {

            FileOutputStream writer = new FileOutputStream(filePath, true);
            ObjectOutputStream obWriter;
            if (!fileExists) {
                obWriter = new ObjectOutputStream(writer);
            } else {
                obWriter = new AppendObjectOutputStream(writer);
            }
            obWriter.writeObject(obj);

        } catch (Exception e) {
            System.out.println("Error al guardar el Objeto" + e);
        }
    }

    static void readObjet(String filePath) {
        boolean cont = true;
        Object obj;
        try {
            InputStream reader = new FileInputStream(filePath);
            ObjectInputStream obReader = new ObjectInputStream(reader);

            while (cont) {
                obj = obReader.readObject();
                if (obj != null) {
                    System.out.println(obj.toString());
                } else {
                    cont = false;
                }
            }
        } catch (EOFException e) {
            System.out.println("Se completo la lectura del archivo");
        } catch (Exception e) {
            System.out.println("Error al recuperar el Objeto " + e);
        }
    }

    public static void main(String[] args) {
        //Escribir autos
        Random r = new Random();
        Auto auto;
        for (int i = 0; i < 10; i++) {
            auto = new Auto(Integer.toString(r.nextInt(10)), Integer.toString(r.nextInt(10)), Integer.toString(r.nextInt(10)));
            //writeObject(auto, "Autos.txt");
        }
        //leer autos;
        readObjet("Autos.txt");

        //escribir zoologico;
        Animal[] animales = {
            new Animal("Leon"),
            new Animal("Tigre"),
            new Animal("Elefante"),
            new Animal("Jirafa"),
            new Animal("Hipopotamo"),
            new Animal("Cebra"),
            new Animal("Oso"),
            new Animal("Lobo"),
            new Animal("Cocodrilo"),
            new Animal("Puma")
        };
        Zoologico zoo;
        for (int i = 0; i < 10; i++) {
            zoo = new Zoologico("zoo" + i, animales[r.nextInt(10)], animales[r.nextInt(10)], animales[r.nextInt(10)]);
            //writeObject(zoo, "Zoologico.txt");
        }

        //leerZoologico
        readObjet("Zoologico.txt");
    }

}
