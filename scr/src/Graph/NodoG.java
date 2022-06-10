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

    // Método getter y setter del atributo sector
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    // Método getter y setter del atributo adyacentes
    public HashMap<NodoG, Arista> getAdyacentes() {
        return adyacentes;
    }

    public void setAdyacentes(HashMap<NodoG, Arista> adyacentes) {
        this.adyacentes = adyacentes;
    }

    // Método getter y setter del atributo datos
    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    // Método getter y setter del atributo posicion_x
    public int getPosicion_x() {
        return posicion_x;
    }
    public void setPosicion_x(int posicion_x) {
        this.posicion_x = posicion_x;
    }

    // Método getter y setter del atributo posicion_y
    public int getPosicion_y() {
        return posicion_y;
    }
    public void setPosicion_y(int posicion_y) {
        this.posicion_y = posicion_y;
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