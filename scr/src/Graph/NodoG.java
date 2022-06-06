package Graph;

import java.util.ArrayList;
import java.util.List;

public class NodoG {

    // Atributos de la clase Nodo
    private String sector;
    private List<Arista> aristas;

    // Constructor de la clase Nodo
    public NodoG(String sector){

        this.sector = sector;
    }

    // Métodos getter y setter
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public List<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(List<Arista> aristas) {
        this.aristas = aristas;
    }

    // Método para agregar una arista
    // Por cada nodo se crea un ArrayList
    // Cada ArrayList se guarda en la lista
    public void agregarArista(Arista arista){

        // Si la lista está vacía (null)
        if (aristas == null) {
            // Se crea un ArrayList por
            aristas = new ArrayList<>();
        }
        // Si la lista no está vacía
        aristas.add(arista);
    }

    // Método que se encarga de mostrar los nodos y su relaciones en formato String
    @Override
    public String toString(){

        return "\n \t NodoG [Sector = " + sector + "; aristas = " + aristas + " ]";
    }
}