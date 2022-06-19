package Algorithms;

import Graph.Grafo;
import Graph.NodoG;

import java.util.List;
import java.util.Stack;

public class FuerzaBruta {

    // La clase será modificada implemnetando otra lógica

    // Atributos de la clase
    private Grafo grafo;
    private NodoG nodoG;

    // Constructor de la clase
    public FuerzaBruta(Grafo grafo){

        this.grafo = grafo;
    }

    // Método que se encarga de encontrar la ruta mínima entre dos nodos del grafo
    public void rutaCostoMinimoFuerzaBruta(NodoG nodoOrigen, NodoG nodoDestino){

        // Se crea una pila para almacenar cada ruta que se evaluará
        Stack<NodoG> rutas = new Stack<NodoG>();
        // Se agregar el nodo origen a la pila
        rutas.add(nodoOrigen);
        // Se dirige al método recorrerRuta()
        recorrerRuta(nodoOrigen, nodoDestino, rutas);
    }

    // Método que se encarga de recorrer las rutas entre el nodo origen y el nodo final
    // Se efectúa de forma recursiva
    public void recorrerRuta(NodoG nodoOrigen, NodoG nodoDestino, Stack<NodoG> rutas){

        int total, i;
        total= grafo.totalNodos();

        // Si el nodo origen es igual al nodo destino
        if (nodoOrigen == nodoDestino){

            for (NodoG nodoG : rutas){

                System.out.print(nodoG.getSector());
                System.out.print(" : " + evaluarRuta(rutas));
                System.out.println();
            }
        }
        // Si el nodo origen y nodo final son diferentes
        else{

            List<NodoG> nodoGList = (List<NodoG>) nodoG.getAdyacentes();

            // Se realiza un for - each loop para recorrer las rutas adyacentes
            for (NodoG nodoG1 : nodoGList){

                rutas.push(nodoG1);
                recorrerRuta(nodoG1, nodoDestino, rutas);
                rutas.pop();
            }
        }
    }

    // Método que se encarga de evaluar la longitud de la ruta
    public int evaluarRuta(Stack<NodoG> rutas){

        int resultado = 0;

        return resultado;
    }
}
