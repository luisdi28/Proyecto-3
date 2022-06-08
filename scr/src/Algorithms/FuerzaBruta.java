package Algorithms;

import Graph.Grafo;
import Graph.NodoG;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class FuerzaBruta {

    // Atributos de la clase
    private Grafo grafo;

    // Constructor de la clase
    public FuerzaBruta(Grafo grafo){

        this.grafo = grafo;
    }

    // Método que se encarga de encontrar la ruta mínima entre dos nodos del grafo
    public void rutaCostoMinimoFuerzaBruta(NodoG nodoOrigen, NodoG nodoDestino){

        // Se crea una pila para almacenar cada ruta que se evaluará
        Stack<NodoG> rutas = new Stack<NodoG>();
        rutas.add(nodoOrigen);
        // Se dirige al método recorrerRuta()
        recorrerRuta(nodoOrigen, nodoDestino, rutas);
    }

    // Método que se encarga de recorrer las rutas entre el nodo origen y el nodo final
    // Se efectúa de forma recursiva
    public void recorrerRuta(NodoG nodoOrigen, NodoG nodoDestino, Stack<NodoG> rutas){

    }

    // Método que se encarga de evaluar la longitud de la ruta
    public int evaluarRuta(){

        int resultado = 0;

        return resultado;
    }
}