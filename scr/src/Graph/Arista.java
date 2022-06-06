package Graph;

public class Arista {

    // Atributos de la clase
    private NodoG nodoOrigen;
    private NodoG nodoDestino;
    private int distancia;

    // Constructor de la clase Arista
    public Arista(NodoG nodoOrigen, NodoG nodoDestino, int distancia){

        this.nodoOrigen = nodoOrigen;
        this.nodoDestino = nodoDestino;
        this.distancia = distancia;
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

    // Método que se encarga de mostrar el nodo de origen, el nodo destino y la distancia entre ellos
    // Lo muestra en formato String
    @Override
    public String toString(){

        return "\n \t Arista [Sector de origen = " + nodoOrigen.getSector() +
                "; Sector destino = " + nodoDestino.getSector() +
                "; Distancia = " + distancia + " ]";
    }
}