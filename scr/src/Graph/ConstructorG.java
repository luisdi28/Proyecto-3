package Graph;

import java.util.ArrayList;
import java.util.Random;

public class ConstructorG {

    // Atributos de la clase
    private Random randomInt;
    private Random randomBoolean;

    // Constructor de la clase
    public ConstructorG(){

        randomBoolean = new Random();
        randomInt = new Random();
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

    public Grafo crearGrafo(int opcion){

        int opcionS = opcion;
        String[] sectores;

        // Se inicializa el grafo
        Grafo grafo = new Grafo();
        NodoG nodoG;
        Arista arista;

        // Variables globales en el método donde i y j serán para recorrer arreglos y
        // distancia guarda el valor generado aleatoriamente con el atributo randomInt
        int arrayLength, i, j, distancia;

        // ArrayList que se usa para tomar el Arraylist que retorna el método getNodos() de la clase Grafo
        ArrayList nodos;

        switch (opcionS){

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
                break;

            default:
                System.out.println("No se ha logrado generar el grafo.");
                break;
        }

        agregarXY(grafo);
        return grafo;
    }

    // Método que se encarga de establecer las posiciones "x" y "y" de los nodos de forma manual
    public void agregarXY(Grafo grafo){

        int total = grafo.totalNodos();

        switch (total){

            case 5:

                grafo.getNodos().get(0).setPosicion_x(60);  // A
                grafo.getNodos().get(0).setPosicion_y(160); // A
                grafo.getNodos().get(1).setPosicion_x(440); // B
                grafo.getNodos().get(1).setPosicion_y(120); // B
                grafo.getNodos().get(2).setPosicion_x(50);  // C
                grafo.getNodos().get(2).setPosicion_y(450); // C
                grafo.getNodos().get(3).setPosicion_x(270); // D
                grafo.getNodos().get(3).setPosicion_y(270); // D
                grafo.getNodos().get(4).setPosicion_x(420); // E
                grafo.getNodos().get(4).setPosicion_y(440); // E

                break;

            case 7:

                grafo.getNodos().get(0).setPosicion_x(120); // A
                grafo.getNodos().get(0).setPosicion_y(270); // A
                grafo.getNodos().get(1).setPosicion_x(300); // B
                grafo.getNodos().get(1).setPosicion_y(100); // B
                grafo.getNodos().get(2).setPosicion_x(480); // C
                grafo.getNodos().get(2).setPosicion_y(160); // C
                grafo.getNodos().get(3).setPosicion_x(20);  // D
                grafo.getNodos().get(3).setPosicion_y(120); // D
                grafo.getNodos().get(4).setPosicion_x(30);  // E
                grafo.getNodos().get(4).setPosicion_y(450); // E
                grafo.getNodos().get(5).setPosicion_x(450); // F
                grafo.getNodos().get(5).setPosicion_y(340); // F
                grafo.getNodos().get(6).setPosicion_x(290); // G
                grafo.getNodos().get(6).setPosicion_y(480); // G

                break;

            case 9:

                grafo.getNodos().get(0).setPosicion_x(25);  // A
                grafo.getNodos().get(0).setPosicion_y(119); // A
                grafo.getNodos().get(1).setPosicion_x(239); // B
                grafo.getNodos().get(1).setPosicion_y(105); // B
                grafo.getNodos().get(2).setPosicion_x(440); // C
                grafo.getNodos().get(2).setPosicion_y(130); // C
                grafo.getNodos().get(3).setPosicion_x(490); // D
                grafo.getNodos().get(3).setPosicion_y(510); // D
                grafo.getNodos().get(4).setPosicion_x(250); // E
                grafo.getNodos().get(4).setPosicion_y(280); // E
                grafo.getNodos().get(5).setPosicion_x(470); // F
                grafo.getNodos().get(5).setPosicion_y(290); // F
                grafo.getNodos().get(6).setPosicion_x(290); // G
                grafo.getNodos().get(6).setPosicion_y(440); // G
                grafo.getNodos().get(7).setPosicion_x(70);  // H
                grafo.getNodos().get(7).setPosicion_y(510); // H
                grafo.getNodos().get(8).setPosicion_x(30);  // I
                grafo.getNodos().get(8).setPosicion_y(340); // I

                break;

            default:

                System.out.println("No se pudo agregar la posicion x,y");

                break;
        }
    }
}