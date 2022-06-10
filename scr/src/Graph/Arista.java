package Graph;

public class Arista {

    // Atributo de la clase
    private int distancia;

    // Constructor de la clase Arista
    public Arista(int distancia){

        this.distancia = distancia;
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

        return "\n \n Clase --> Arista --> Distancia = " + distancia;
    }
}