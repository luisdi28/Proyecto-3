package Graph;

public class Arista {

    // Atributos de la clase
    private NodoG nodoOrigen;
    private NodoG nodoDestino;
    private int peso;

    // Constructor de la clase Arista
    public Arista(NodoG nodoOrigen, NodoG nodoDestino, int peso){

        this.nodoOrigen = nodoOrigen;
        this.nodoDestino = nodoDestino;
        this.peso = peso;
    }

    
}
