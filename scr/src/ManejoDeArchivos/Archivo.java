package ManejoDeArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Archivo {

    File file;
    FileWriter fileWriter;
    PrintWriter printWriter;
    BufferedWriter bufferedWriter;

    public Archivo(){

        this.file = new File("PruebaTXT/Info.txt");
    }
}