package Algorithms;

import java.util.*;

// Se hace el llamado de las clases que están el paquete Graph
import Graph.NodoG;
import Graph.Arista;
import ManejoDeArchivos.Archivo;

public class Dijkstra {

    // Atributos de la clase
    private PriorityQueue<NodoG> priorityQueue;
    private Archivo archivo;
    String texto;

    // Constructor de la clase
    public Dijkstra(){

        texto = "";
        archivo = new Archivo();
    }

    // Método que se encarga de obtener el costo mínimo de la ruta
    public void rutaCostoMinimoDijkstra(NodoG origen){

        // Inicia el recorrido con valor 0 desde el nodo origen
        origen.setDistanciaMinima(0);
        // Se crea una cola de prioridad fundamental para el algoritmo de Dijkstra
        priorityQueue = new PriorityQueue<NodoG>();
        // Se agrega el nodo origen
        priorityQueue.add(origen);

        // Mientras la cola de prioridad no esté vacia
        while (!priorityQueue.isEmpty()){

            // Se crea un nodo el cual será el primer elemento de la cola
            NodoG nodoAux = priorityQueue.poll();

            // Se recorren los nodos adyacentes
            for (Arista arista : nodoAux.getAdyacentesLista()){

                // Se crea un nodo y se guarda como el nodo destino
                NodoG nodoG = arista.getNodoDestino();
                // Se obtiene la distancia
                int peso = arista.getDistancia();
                // Se suma la distancia mínima + peso
                int rutaDistanciaMin = nodoAux.getDistanciaMinima() + peso;

                // Si la ruta mínima es menor a la distancia mínima
                if (rutaDistanciaMin < nodoG.getDistanciaMinima()){

                    // Se remueve el nodo destino
                    priorityQueue.remove(nodoG);
                    // nodoG para a tomar el valor de nodoAux
                    nodoG.setNodoAnterior(nodoAux);
                    // Se actualiza la distancia mínima
                    nodoG.setDistanciaMinima(rutaDistanciaMin);
                    // Finalmente se agrega el nodoG a la cola de prioridad
                    priorityQueue.add(nodoG);
                }
            }
        }
    }

    // Método que se encarga de obtener y retornar la ruta de costo mínimo
    public List<NodoG> obtenerRuta(NodoG destino){

        // Se crea una lista de tipo ArrayList
        List<NodoG> ruta = new ArrayList<NodoG>();

        // Se recorre la cola o lista mientras sea diferente de null y se agrega el nodo a la lista
        for (NodoG nodoG = destino; nodoG != null; nodoG = nodoG.getNodoAnterior()){
            ruta.add(nodoG);
        }

        // Invierte la lista
        Collections.reverse(ruta);

        // Se escribe en el txt la ruta cuando se llama al método de Dijkstra
        texto = "Ruta calculada mediante el algoritmo de Dijkstra: \n" + ruta.toString().replace("[", "").replace("]", "").replace(",", "");
        archivo.escribir(texto);

        return ruta;
    }
}