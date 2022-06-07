package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NodoG {

    // Atributos de la clase Nodo
    private String sector;
    private HashMap<NodoG, Arista> adyacentes = new HashMap<NodoG, Arista>();
    private String datos;
    private int posicion_x;
    private int posicion_y;

    // Constructor de la clase Nodo
    public NodoG(String sector){

        this.sector = sector;
        datos = "";
    }

    // Métodos getter y setter
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public HashMap<NodoG, Arista> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(HashMap<NodoG, Arista> adyacentes) {
        this.adyacentes = adyacentes;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    // Método para agregar una arista
    // Por cada nodo se crea un ArrayList
    // Cada ArrayList se guarda en la lista
    public void agregarArista(Arista arista, NodoG destino) {

        if (!Grafo.existeNodo(destino)) {
            System.out.println("No existe el nodo");
        } else if (!adyacentes.containsKey(destino)) {
            adyacentes.put(destino, arista);
        } else {
            System.out.println("La arista ya existe");
        }
    }

    // Método que se encarga de mostrar los nodos y su relaciones en formato String
    @Override
    public String toString(){

        return "\n \t NodoG [Sector = " + sector + "; aristas = " + adyacentes + " ]";
    }
}