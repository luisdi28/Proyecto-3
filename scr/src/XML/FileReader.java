package XML;

import java.io.File;
/*
Lo ideal es que esta clase sea un metodo de Startgame y no una clase como tal
puesto que ocupa releer de nuevo cuando se presione el boton jugar
 */
public class FileReader {
    String folderpath = "";
    File file;
    File[] files;
    public FileReader(){
        folderpath = "GameRecords";
    }
    public void readFolder(){
        file = new File(folderpath);
        files = file.listFiles();
        for (File  file: files){ //aca se llama a circularlist.add(file)
            System.out.println("the filename is" + file.getName());
            System.out.println("the filename is" + file.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFolder();
    }
}
