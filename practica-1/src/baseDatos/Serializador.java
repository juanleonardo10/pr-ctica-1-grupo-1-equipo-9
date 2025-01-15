package baseDatos;

//DHC - Falta serializar listas!!!

import java.io.*;
import java.util.ArrayList;

public class Serializador { //Se encargara de agregar y serializar los objetos creados mientras corre.   

    public static void serializar(ArrayList<? extends Object> lista, String nombre) {
        File archivo = new File("");
        try {
            File ruta = new File(archivo.getAbsolutePath()+"/src/baseDatos/temp/"+nombre+".txt");
            FileOutputStream fileOut = new FileOutputStream(ruta);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(lista);
            objectOut.close();
            fileOut.close();
            System.out.println("El objeto ha sido serializado");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró");
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Error al serializar el objeto");
        }
    }
}

