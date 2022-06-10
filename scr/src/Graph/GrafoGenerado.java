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

    // Método que se encarga de tomar el valor entero dado
    // Se usa el método Switch-case para definir los nodos
    // Mediante arreglos con tamaños predeterminados

    public void crearGrafo(){

        int opcion;
        opcion = this.opcion;
        String[] sectores;

        switch (opcion){

            case 5:
                // Se inicializa el arreglo de tipo String con los sectores establecidos
                sectores = new String[]{"SectorA", "SectorB", "SectorC", "SectorD", "SectorE"};
                break;

            case 7:
                // Se inicializa el arreglo de tipo String con los sectores establecidos
                sectores = new String[]{"SectorA", "SectorB", "SectorC", "SectorD", "SectorE", "SectorF", "SectorG"};
                break;

            case 9:
                // Se inicializa el arreglo de tipo String con los sectores establecidos
                sectores = new String[]{"SectorA", "SectorB", "SectorC",
                                        "SectorD", "SectorE", "SectorF",
                                        "SectorG", "SectorH", "SectorI"};
                break;

            default:

                System.out.println("No se ha logrado generar el grafo.");
                break;
        }
    }

    // Método que se encarga de crear los nodos y las conexión entre distintos nodos de forma aleatoria
    public Grafo establecerGrafo(String[] sectores){

        // Se inicializa el grafo
        Grafo grafo = new Grafo();
        NodoG nodoG;
        Arista arista;

        // Variables globales en el método donde i y j serán para recorrer arreglos y
        // distancia guarda el valor generado aleatoriamente con el atributo randomInt
        int arrayLength, i, j, distancia;
        arrayLength= sectores.length;

        // ArrayList que se usa para tomar el Arraylist que retorna el método getNodos() de la clase Grafo
        ArrayList nodos;

        // Cada elemento del arreglo sectores se convierte en un nodo del grafo
        for(i = 0; i < sectores.length; i++){

            // Se crea un nuevo nodo y se añade al grafo
            nodoG = new NodoG(sectores[i]);
            grafo.agregarNodo(nodoG);
        }

        // La variable creada en este método toma el ArrayList que retorna el método getNodos()
        nodos = grafo.getNodos();

        // Se crean las conexiones entre nodos para el grafo dirigido
        // Se ejecuta m veces donde m es igual al tamaño del ArrayList
        for (i = 0; i < arrayLength; i++){
            // Se ejecuta n veces donde n es igual al tamaño del ArrayList * tamaño del ArrayList
            for (j = 0; j < arrayLength; j++){

                // Se ejecuta solo si el valor generado es true
                if (randomBoolean.nextBoolean() == true){

                    // Si los valores son los mismos se continua sin generar una conexión
                    // Esto se hace para que el nodo no esté relacionado consigo mismo
                    if (nodos.get(i).equals(nodos.get(j))){
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
        return grafo;
    }
}