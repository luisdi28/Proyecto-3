package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NodoG implements Comparable<NodoG>{

    // Atributos de la clase Nodo
    private String sector;
    private int posicion_x;
    private int posicion_y;
    private int distanciaMinima = Integer.MAX_VALUE;
    private boolean visitado;
    private HashMap<NodoG, AristaH> adyacentes = new HashMap<NodoG, AristaH>();
    private List<Arista> adyacentesLista;
    private NodoG nodoAnterior;

    // Constructor de la clase Nodo
    public NodoG(String sector){

        this.sector = sector;
        this.adyacentesLista = new ArrayList<Arista>();
    }

    // Método getter y setter del atributo sector
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
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

    // Método getter y setter del atributo distanciaMinima
    public int getDistanciaMinima() {
        return distanciaMinima;
    }
    public void setDistanciaMinima(int distanciaMinima) {
        this.distanciaMinima = distanciaMinima;
    }

    // Método getter y setter del atributo visitado
    public boolean isVisitado() {
        return visitado;
    }
    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    // Método getter y setter del atributo adyacentes
    public List<Arista> getAdyacentesLista() {
        return adyacentesLista;
    }
    public void setAdyacentesLista(List<Arista> adyacentesLista) {
        this.adyacentesLista = adyacentesLista;
    }

    // Método getter y setter del atributo nodoAnterior
    public NodoG getNodoAnterior() {
        return nodoAnterior;
    }
    public void setNodoAnterior(NodoG nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

    // Método getter y setter del atributo adyacentes
    public HashMap<NodoG, AristaH> getAdyacentes() {
        return adyacentes;
    }
    public void setAdyacentes(HashMap<NodoG, AristaH> adyacentes) {
        this.adyacentes = adyacentes;
    }

    // Métodos para agregar una arista
    // Por cada nodo se crea un ArrayList
    // Cada ArrayList se guarda en la lista
    public void agregarAristaNodos(AristaH arista, NodoG destino){

        if (!adyacentes.containsKey(destino)) {
            adyacentes.put(destino, arista);
        }
    }
    public void agregarArista(Arista arista) {
        this.adyacentesLista.add(arista);
    }

    @Override
    public int compareTo(NodoG nodoG) {
        return Integer.compare(this.distanciaMinima, nodoG.getDistanciaMinima());
    }

    // Método que se encarga de mostrar el nodo solicitado en formato String
    @Override
    public String toString(){
        return "\nClase --> NodoG --> Sector = " + sector + " ";
    }
}