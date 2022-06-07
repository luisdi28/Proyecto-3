package Graph;

import java.util.Random;

// Clase creada como prototipo a una idea
public class GrafoGenerado {

    // Atributos de la clase
    private int opcion;
    private Random randomInt;
    private Random randomBoolean;

    // Constructor de la clase
    public GrafoGenerado(int opcion){

        this.opcion = opcion;
        randomBoolean = new Random();
        randomInt = new Random();
    }

    // Métodos getter y setter
    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public Random getRandomInt() {
        return randomInt;
    }
    public void setRandomInt(Random randomInt) {
        this.randomInt = randomInt;
    }

    public Random getRandomBoolean() {
        return randomBoolean;
    }

    public void setRandomBoolean(Random randomBoolean) {
        this.randomBoolean = randomBoolean;
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

        // Largo del arreglo
        int arrayLength;

        // Variables globales en el método donde i y j serán para recorrer arreglos y
        // distancia guarda el valor generado aleatoriamente con el atributo randomInt
        int i, j;
        int distancia;

        switch (opcion){

            case 5:

                // Se inicializa el arreglo de tipo String con los sectores establecidos
                sectores = new String[]{"SectorA", "SectorB", "SectorC", "SectorD", "SectorE"};
                arrayLength = sectores.length;

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
                arrayLength = sectores.length;

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
                arrayLength = sectores.length;

                // Cada elemento del arreglo sectores se convierte en un nodo del grafo
                for(i = 0; i < sectores.length; i++){

                    // Se crea un nuevo nodo y se añade al grafo
                    nodoG = new NodoG(sectores[i]);
                    grafo.agregarNodo(nodoG);
                }

                // Se crean las conexiones entre nodos para el grafo dirigido
                for (i = 0; i < arrayLength; i++){
                    for (j = 0; j < arrayLength; j++){

                        if (randomBoolean.nextBoolean() == true){
                            if (sectores[i].equals(sectores[j])){
                                continue;
                            }
                            else{
                                distancia = randomInt.nextInt(10, 40);
                                //grafo.conectarNodos(sectores[i], sectores[j], new Arista(distancia));
                            }
                        }
                    }
                }
                break;

            default:
                System.out.println("No se ha creado el grafo correctamente.");
                break;
        }

        return grafo;
    }
}