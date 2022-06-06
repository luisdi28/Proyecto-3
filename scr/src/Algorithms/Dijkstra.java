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

        grafoNodos = grafo.getNodos();

        for (int i = 0; i < grafo.totalNodos(); i++){
            nodos.put(grafoNodos.get(i), Integer.MAX_VALUE);
        }

        // Nodo origen es 0
        nodos.put(origen, 0);

        // Variables propias del método
        int peso, pesoNodo;
        NodoG nodoAux;
        HashMap<NodoG, Arista> aristas = null;
        Object[] adyacentes;

        do{

            nodoAux = obtenerMenor();
            nodoAux.setDatos("Recorrido");
            aristas = nodoAux.getAdyacentes();
            adyacentes = nodoAux.getAdyacentes().keySet().toArray();
            pesoNodo = nodos.get(nodoAux);

            for (int i = 0; i < aristas.size(); i++){

                peso = aristas.get(adyacentes[i]).getDistancia();

                if ((pesoNodo + peso) < nodos.get((NodoG)adyacentes[i])){
                    nodos.put((NodoG) adyacentes[i], pesoNodo + peso);
                }
            }

        }while(recorridoCompleto() == false);

        return nodos.get(destino);
    }

    // Método que se encarga de retornar el nodo con la ruta registrada más corta
    public NodoG obtenerMenor(){

        Integer menor = Integer.MAX_VALUE;
        Integer aux;
        NodoG nodoMenor = null;

        for (int i = 0; i < grafo.totalNodos(); i++){

            aux = nodos.get(grafoNodos.get(i));
            
            if (aux <= menor && grafoNodos.get(i).getDatos().equals("") == true){

                menor = aux;
                nodoMenor = grafoNodos.get(i);
            }
        }

        return nodoMenor;
    }

    // Método que se encarga de verificar si se han recorrido todos los nodos
    public boolean recorridoCompleto(){

        return true;
    }
}