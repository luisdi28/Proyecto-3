package Graph;

import ManejoDeArchivos.Archivo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ConstructorG {

    // Atributos de la clase
    private Random randomInt;
    private String texto;
    private Archivo archivo;
    StringBuilder stringBuilder;

    // Constructor de la clase
    public ConstructorG(){

        randomInt = new Random();
        texto = "";
        archivo = new Archivo();
        stringBuilder = new StringBuilder();
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    // Método getter y setter del atributo randomInt
    public Random getRandomInt() {
        return randomInt;
    }
    public void setRandomInt(Random randomInt) {
        this.randomInt = randomInt;
    }

    // Método que se encarga de tomar el valor entero dado
    // Se usa el método Switch-case para definir los nodos
    // Mediante arreglos con tamaños predeterminados
    public Grafo crearGrafo(int opcion){

        int opcionS = opcion;

        // Arreglo de sectores (para los nodos)
        String[] sectores;

        // Se inicializa el grafo
        Grafo grafo = new Grafo();
        NodoG nodoG;
        AristaH arista;

        // Variables globales en el método donde i y j serán para recorrer arreglos y
        // distancia guarda el valor generado aleatoriamente con el atributo randomInt en cuanto a peso
        // Se usa contador para que cada nodo tengan como mínimo dos nodos adyacentes
        // Esto usa para que al aplicar el algoritmo de Dijkstra el algoritmo no se caiga debido
        // A que el nodo destino no sea adyacente del algún otro nodo
        // posRandom se usa para tomar una posicion random en el ArrayList de nodos, usa randomInt
        int arrayLength, i, j, distancia, contador, posRandom;

        // ArrayList que se usa para tomar el Arraylist que retorna el método getNodos() de la clase Grafo
        ArrayList nodos;

        switch (opcionS){

            case 5:
                // Se inicializa el arreglo de tipo String con los sectores establecidos
                sectores = new String[]{"SectorA", "SectorB", "SectorC", "SectorD", "SectorE"};

                arrayLength = sectores.length;

                // Cada elemento del arreglo sectores se convierte en un nodo del grafo
                for(i = 0; i < arrayLength; i++){

                    // Se crea un nuevo nodo y se añade al grafo
                    nodoG = new NodoG(sectores[i]);
                    grafo.agregarNodo(nodoG);
                }

                // Se crean las conexiones entre nodos para el grafo dirigido
                // Se ejecuta m veces donde m es igual al tamaño del ArrayList
                for (i = 0; i < arrayLength; i++){

                    // Se toma un número entero para definir la cantidad de aristas
                    contador = randomInt.nextInt(2, 5);

                    // Se ejecuta mientras contador sea mayor a cero
                    while (contador > 0){

                        // Toma una posición aleatoria el cual será la posición del ArrayList de nodos
                        posRandom = randomInt.nextInt(0, 5);

                        // Nodo origen
                        NodoG nodoO = grafo.getNodos().get(i);
                        // Nodo destino
                        NodoG nodoD = grafo.getNodos().get(posRandom);

                        // Compara ambos nodos y si son iguales, continua sin conectar nodos
                        if (nodoO.equals(nodoD) == true){
                            continue;
                        }

                        // En caso de ser diferentes
                        else{

                            // Se crea un peso aleatorio entre 10 y 41
                            distancia = randomInt.nextInt(10, 41);
                            // Se realiza la conexión entre nodos con una arista de peso aleatorio
                            nodoO.agregarArista(new Arista(nodoO, nodoD, distancia));
                            grafo.conectarNodos(nodoO, nodoD, new AristaH(distancia));

                            // El contador se empieza a restar una vez el nodo tenga al menos un
                            // nodo adyacente debido a los problemas con el algoritmo de Dijkstra
                            if (nodoO.getAdyacentesLista().size() > 1){
                                contador--;
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

                    // Se toma un número entero para definir la cantidad de aristas
                    contador = randomInt.nextInt(2, 7);

                    // Se ejecuta mientras contador sea mayor a cero
                    while (contador > 0){

                        // Toma una posición aleatoria el cual será la posición del ArrayList de nodos
                        posRandom = randomInt.nextInt(0, 8);

                        // Nodo origen
                        NodoG nodoO = grafo.getNodos().get(i);
                        // Nodo destino
                        NodoG nodoD = grafo.getNodos().get(posRandom);

                        // Compara ambos nodos y si son iguales, continua sin conectar nodos
                        if (nodoO.equals(nodoD) == true){
                            continue;
                        }

                        // En caso de ser diferentes
                        else{

                            // Se crea un peso aleatorio entre 10 y 41
                            distancia = randomInt.nextInt(10, 41);
                            // Se realiza la conexión entre nodos con una arista de peso aleatorio
                            nodoO.agregarArista(new Arista(nodoO, nodoD, distancia));

                            grafo.conectarNodos(nodoO, nodoD, new AristaH(distancia));

                            // El contador se empieza a restar una vez el nodo tenga al menos un
                            // nodo adyacente debido a los problemas con el algoritmo de Dijkstra
                            if (nodoO.getAdyacentesLista().size() > 1){
                                contador--;
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

                    // Se toma un número entero para definir la cantidad de aristas
                    contador = randomInt.nextInt(2, 9);

                    // Se ejecuta mientras contador sea mayor a cero
                    while (contador > 0){

                        // Toma una posición aleatoria el cual será la posición del ArrayList de nodos
                        posRandom = randomInt.nextInt(0, 10);

                        // Nodo origen
                        NodoG nodoO = grafo.getNodos().get(i);
                        // Nodo destino
                        NodoG nodoD = grafo.getNodos().get(posRandom);

                        // Compara ambos nodos y si son iguales, continua sin conectar nodos
                        if (nodoO.equals(nodoD) == true){
                            continue;
                        }

                        // En caso de ser diferentes
                        else{

                            // Se crea un peso aleatorio entre 10 y 41
                            distancia = randomInt.nextInt(10, 41);
                            // Se realiza la conexión entre nodos con una arista de peso aleatorio
                            nodoO.agregarArista(new Arista(nodoO, nodoD, distancia));
                            grafo.conectarNodos(nodoO, nodoD, new AristaH(distancia));

                            // El contador se empieza a restar una vez el nodo tenga al menos un
                            // nodo adyacente debido a los problemas con el algoritmo de Dijkstra
                            if (nodoO.getAdyacentesLista().size() > 1){
                                contador--;
                            }
                        }
                    }
                }
                break;

            default:
                System.out.println("No se ha logrado generar el grafo.");
                break;
        }

        // Llamado de métodos
        registrarNodos(grafo);
        crearMatrizAdyacencia(grafo);
        registrarAdyacentes(grafo);
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

    // Método que se encarga de escribir los nodos existentes en el txt
    public void registrarNodos(Grafo grafo){

        // Restablece el valor del stringBuilder
        stringBuilder.setLength(0);

        // Guarda lo que retorna el método
        stringBuilder.append(grafo.toString());

        // se escribe en el txt
        archivo.escribir("\nNodos existentes en el grafo: " + String.valueOf(stringBuilder) + "\n");
    }

    // Método que se encarga de crear la matriz de adyacencia
    // También, se encarga de escribir la matriz en el txt
    public void crearMatrizAdyacencia(Grafo grafo){

        int m = grafo.totalNodos();
        int i, j;

        // Matriz mxm donde m es la cantidad de nodos que tiene el grafo
        String[][] matrizAdyacencia = new String[m][m];

        // Creando la matriz de adyacencia
        for (i = 0; i < m; i++){
            for (j = 0; j < m; j++){

                // Nodo origen
                NodoG nodoO = grafo.getNodos().get(i);
                // Nodo destino
                NodoG nodoD = grafo.getNodos().get(j);

                // Si existe relación entre el nodo origen y el nodo destino
                if (nodoO.getAdyacentes().containsKey(nodoD)){

                    // Se agrega 1 como true
                    matrizAdyacencia[i][j] = "1";
                }

                // Si no existe relación entre el nodo origen y el nodo destino
                else {

                    // Se agrega 0 como false
                    matrizAdyacencia[i][j] = "0";
                }
            }
        }

        // Se inicializa el valor de texto
        texto = "Matriz de adyacencia --> " + Arrays.deepToString(matrizAdyacencia).toString() + "\n";
        // Se escribe en el txt la matriz en formato [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
        archivo.escribir(texto);

        // Llamado de método
        registrarMatrizAdyacencia(matrizAdyacencia, m);
    }

    // Método que se encarga de escribir la matriz de adyacencia en el txt
    public void registrarMatrizAdyacencia(String[][] matrizAdyacencia, int m){

        // Restablece el valor del stringBuilder
        stringBuilder.setLength(0);

        // Dando formato a la matriz
        // Mediante stringBuilder.append() se realiza la concatenación en tod el recorrido de la matriz
        for (int i = 0; i < m; i++){

            stringBuilder.append("\t\t [ ");
            for (int j = 0; j < m; j++){

                // Se agrega el valor en la posicion [i][j]
                stringBuilder.append(matrizAdyacencia[i][j] + " ");

            }

            stringBuilder.append("]");
            stringBuilder.append("\n");
        }

        // Se escribe en el txt
        archivo.escribir(String.valueOf(stringBuilder));
    }

    // Método que se encarga de escribir los nodos adyacentes de cada nodo en el txt
    public void registrarAdyacentes(Grafo grafo){

        // Restablece el valor del stringBuilder
        stringBuilder.setLength(0);

        int limite = grafo.totalNodos();

        for (int i = 0; i < limite; i++){

            // Nodo origen
            NodoG nodoG = grafo.getNodos().get(i);

            // Agrega el nodo origen y los nodos adyacente en el mismo stringBuilder
            stringBuilder.append(grafo.nodosAdyacentes(nodoG));
            stringBuilder.append("\n");
        }

        // Escribe en el txt
        archivo.escribir(String.valueOf(stringBuilder));
    }
}