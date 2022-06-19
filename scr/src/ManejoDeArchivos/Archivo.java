package ManejoDeArchivos;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {

    // Atributos de la clase
    File file;
    FileWriter fileWriter;
    PrintWriter printWriter;
    BufferedWriter bufferedWriter;

    // Constructor de la clase
    public Archivo() {

        // Ruta y nombre del archivo
        this.file = new File("Registro/Info.txt");
    }

    // Método que se encarga de escribir en el archivo de texto
    public void escribir(String texto) {

        // Si el archivo no existe
        if (!file.exists()) {

            try {

                // Crea el archivo
                file.createNewFile();
                fileWriter = new FileWriter(file, true);
                printWriter = new PrintWriter(fileWriter);
                printWriter.println(texto);
                printWriter.close();
                fileWriter.close();

            } catch (IOException e) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        // Si el archivo ya existe
        else {

            try {

                fileWriter = new FileWriter(file, true);
                printWriter = new PrintWriter(fileWriter);
                printWriter.println(texto);
                printWriter.close();
                fileWriter.close();

            } catch (IOException e) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    // Método que se encarga de limpiar todo lo escrito en el archivo Info.txt
    public void limpiar() throws IOException {

        // Toma el archivo
        bufferedWriter = new BufferedWriter(new FileWriter(file));
        // Limpia el archivo
        bufferedWriter.write("");
        // Cierra el archivo
        bufferedWriter.close();
    }
}
