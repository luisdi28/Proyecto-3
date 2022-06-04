package Graph;

public class Arista {

    // Atributos de la clase
    private NodoG nodoOrigen;
    private NodoG nodoDestino;
    private int distancia;

    // Constructor de la clase Arista
    public Arista(NodoG nodoOrigen, NodoG nodoDestino, int peso){

        this.nodoOrigen = nodoOrigen;
        this.nodoDestino = nodoDestino;
        this.distancia = peso;
    }

    // Métodos getter y setter
    public NodoG getNodoOrigen() {
        return nodoOrigen;
    }

    public void setNodoOrigen(NodoG nodoOrigen) {
        this.nodoOrigen = nodoOrigen;
    }

    public NodoG getNodoDestino() {
        return nodoDestino;
    }

    public void setNodoDestino(NodoG nodoDestino) {
        this.nodoDestino = nodoDestino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    
}
