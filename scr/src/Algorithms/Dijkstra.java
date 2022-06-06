package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;

// Se hace el llamado de las clases que están el paquete Graph
import Graph.NodoG;
import Graph.Arista;
import Graph.Grafo;

public class Dijkstra {

    // Atributos de la clase
    private HashMap<NodoG, Integer> nodos = new HashMap<NodoG, Integer>();
    private Grafo grafo;
    private ArrayList<NodoG> grafoNodos;

    // Constructor de la clase
    public Dijkstra(Grafo grafo){

        this.grafo = grafo;
    }

    // Método que se encarga de detectar la ruta más corta entre dos nodos
    public int rutaCostoMinimo(NodoG origen, NodoG destino){

        
        return nodos.get(destino);
    }

    // Método que se encarga de retornar el nodo con la ruta registrada más corta
    public NodoG obtenerMenor(){

        Integer menor = Integer.MAX_VALUE;
        Integer aux;
        NodoG nodoMenor = null;


        return nodoMenor;
    }

    // Método que se encarga de verificar si se han recorrido todos los nodos
    public boolean recorridoCompleto(){

        return true;
    }
}