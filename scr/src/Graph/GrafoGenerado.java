package Graph;

import java.util.Random;

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

        // Se guarda el valor dado en una variable para el método Switch-case
        int opcion = this.opcion;

        // Se inicializa el grafo
        Grafo grafo = new Grafo();

        // Se inicializa el nodo
        NodoG nodoG;

        // Se inicializa la arista
        Arista arista;

        // Se crea un arreglo de tipo String sin declarar tamaño ni valores
        String[] sectores;

        // Variables globales en el método donde i y j serán para recorrer arreglos y m para guardar el número random dado
        int i, j, m;
        Random random;

        switch (opcion){

            case 5:

                // Se inicializa el arreglo de tipo String con los sectores establecidos
                sectores = new String[]{"SectorA", "SectorB", "SectorC", "SectorD", "SectorE"};

                // Cada elemento del arreglo sectores se convierte en un nodo del grafo
                for(i = 0; i < sectores.length; i++){

                    // Se crea un nuevo nodo y se añade al grafo
                    nodoG = new NodoG(sectores[i]);
                    grafo.agregarNodo(nodoG);
                }

                // Se crean las conexiones entre nodos para el grafo dirigido
                // Se tiene em mente crear un bucle donde se relicen las conexiones enre nodos de forma aleatoria

                break;

            case 7:

                // Se inicializa el arreglo de tipo String con los sectores establecidos
                sectores = new String[]{"SectorA", "SectorB", "SectorC", "SectorD", "SectorE", "SectorF", "SectorG"};

                // Cada elemento del arreglo sectores se convierte en un nodo del grafo
                for(i = 0; i < sectores.length; i++){

                    // Se crea un nuevo nodo y se añade al grafo
                    nodoG = new NodoG(sectores[i]);
                    grafo.agregarNodo(nodoG);
                }

                // Se crean las conexiones entre nodos para el grafo dirigido
                // Se tiene em mente crear un bucle donde se relicen las conexiones enre nodos de forma aleatoria

                break;

            case 9:

                // Se inicializa el arreglo de tipo String con los sectores establecidos
                sectores = new String[]{"SectorA", "SectorB", "SectorC",
                                        "SectorD", "SectorE", "SectorF",
                                        "SectorG", "SectorH", "SectorI"};

                // Cada elemento del arreglo sectores se convierte en un nodo del grafo
                for(i = 0; i < sectores.length; i++){

                    // Se crea un nuevo nodo y se añade al grafo
                    nodoG = new NodoG(sectores[i]);
                    grafo.agregarNodo(nodoG);
                }

                // Se crean las conexiones entre nodos para el grafo dirigido
                // Se tiene em mente crear un bucle donde se relicen las conexiones enre nodos de forma aleatoria

                break;

            default:
                System.out.println("No se ha creado el grafo correctamente.");
                break;
        }

        return grafo;
    }
}