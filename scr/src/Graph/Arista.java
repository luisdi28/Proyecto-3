package Graph;

public class Arista {

    // Atributo de la clase
    private int distancia;

    // Constructor de la clase Arista
    public Arista(int distancia){

        this.distancia = distancia;
    }

    // Métodos getter y setter
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
        /*
        return "\n \t Arista [Sector de origen = " + nodoOrigen.getSector() +
                "; Sector destino = " + nodoDestino.getSector() +
                "; Distancia = " + distancia + " ]";
         */
        return null;
    }
}