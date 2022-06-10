package Graph;

import java.util.ArrayList;
import java.util.Random;

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

    // Método getter y setter del atributo opcion
    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    // Método getter y setter del atributo randomInt
    public Random getRandomInt() {
        return randomInt;
    }
    public void setRandomInt(Random randomInt) {
        this.randomInt = randomInt;
    }

    // Método getter y setter del atributo randomBoolean
    public Random getRandomBoolean() {
        return randomBoolean;
    }

    public void setRandomBoolean(Random randomBoolean) {
        this.randomBoolean = randomBoolean;
    }

    // Método que se encarga de crear el grafo
    // Lo crea mediante un método Switch-case
    // Este método se maneja de acuerdo a un valor entero
    // Donde cada valor entero posee un tamaño de nodos diferente
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
        // ArrayList que se usa para tomar el Arraylist que retorna el método getNodos() de la clase Grafo
        ArrayList arrayList;

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

                // Cada elemento del arreglo sectores se convierte en un nodo del grafo
                for(i = 0; i < sectores.length; i++){

                    // Se crea un nuevo nodo y se añade al grafo
                    nodoG = new NodoG(sectores[i]);
                    grafo.agregarNodo(nodoG);
                }

                // La variable creada en este método toma el ArrayList que retorna el método getNodos()
                arrayList = grafo.getNodos();
                // arrayLength toma el tamaño del arrayList
                arrayLength = arrayList.size();

                // Se crean las conexiones entre nodos para el grafo dirigido
                // Se ejecuta m veces donde m es igual al tamaño del ArrayList
                for (i = 0; i < arrayLength; i++){
                    // Se ejecuta n veces donde n es igual al tamaño del ArrayList * tamaño del ArrayList
                    for (j = 0; j < arrayLength; j++){

                        // Se ejecuta solo si el valor generado es true
                        if (randomBoolean.nextBoolean() == true){

                            // Si los valores son los mismos se continua sin generar una conexión
                            // Esto se hace para que el nodo no esté relacionado consigo mismo
                            if (arrayList.get(i).equals(arrayList.get(j))){
                                continue;
                            }
                            // En caso de ser true y diferentes
                            else{
                                // Se genera una distancia aleatoria entre 10 y 40
                                distancia = randomInt.nextInt(10, 40);
                                // Se realiza la conexión
                                grafo.conectarNodos(grafo.getNodos().get(i), grafo.getNodos().get(j), new Arista(distancia));
                                // Segunda opción
                                // grafo.conectarNodos((NodoG) arrayList.get(i), (NodoG) arrayList.get(j), new Arista(distancia));
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