package Graph;

public class Arista {

    // Atributo de la clase
    private int distancia;
    private NodoG nodoOrigen;
    private NodoG nodoDestino;

    // Constructor de la clase Arista
    public Arista(NodoG origen, NodoG destino, int distancia){

        this.nodoOrigen = origen;
        this.nodoDestino = destino;
        this.distancia = distancia;
    }

    // Método getter y setter del atributo nodoOrigen
    public NodoG getNodoOrigen() {
        return nodoOrigen;
    }
    public void setNodoOrigen(NodoG nodoOrigen) {
        this.nodoOrigen = nodoOrigen;
    }

    // Método getter y setter del atributo nodoDestino
    public NodoG getNodoDestino() {
        return nodoDestino;
    }
    public void setNodoDestino(NodoG nodoDestino) {
        this.nodoDestino = nodoDestino;
    }

    // Método getter y setter del atributo distancia
    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    // Método que se encarga de mostrar la distancia establecida entre dos nodos
    // Lo muestra en formato String
    @Override
    public String toString(){
        return " Clase --> Arista --> Distancia = " + distancia;
    }
}