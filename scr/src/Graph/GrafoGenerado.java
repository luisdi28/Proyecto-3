package Graph;

// Clase creada como prototipo a una idea
public class GrafoGenerado {

    // Atributo de la clase
    private int opcion;

    // Constructor de la clase
    public GrafoGenerado(int opcion){

        this.opcion = opcion;
    }

    // Métodos getter y setter

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    // Método que se encarga de crear el grafo
    public Grafo generarGrafo(){

        int opcion = this.opcion;
        Grafo grafo = new Grafo();
        String[] sectores;

        switch (opcion){

            case 5:

                break;

            case 7:

                break;

            case 9:

                break;

            default:

                break;
        }

        return grafo;
    }
}