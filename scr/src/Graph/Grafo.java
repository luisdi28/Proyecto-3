package Graph;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    // Atributo de la clase
    private static ArrayList<NodoG> nodos;
    // Tal vez se usará más adelante -> private ArrayList<NodoG> visitados;

    // Constructor de la clase
    public Grafo(){

        nodos = new ArrayList<NodoG>();
    }

    // Método que se encarga de agregar nodos al grafo
    public void agregarNodo(NodoG nodoG){

        // Se verifica que el nodo no exista
        if (!nodos.contains(nodoG)){
            // Se agrega el nodo al ArrayList
            nodos.add(nodoG);
        }

        // En caso de que el nodo ya exista
        else{
            System.out.println("El nodo " + nodoG.toString() + " ya existe.");
        }
    }

    // Método que se encarga de realizar la conexión entre dos nodos
    public void conectarNodos(NodoG nodoOrigen, NodoG nodoDestino, Arista arista){

        // Condicional que conecta los nodos en caso de que el nodo destino no forme
        // parte de los nodos adyacentes al nodo origen
        if (!nodoOrigen.getAdyacentes().containsKey(nodoDestino)){
            nodoOrigen.agregarArista(arista, nodoDestino);
        }

        // En caso de que exista la conexión
        else{
            System.out.println("La conexión entre el nodo " + nodoOrigen + " y el nodo " + nodoDestino + " existe.");
        }
    }

    // Método getter de la clase
    public ArrayList<NodoG> getNodos() {
        return nodos;
    }

    // Método que se encarga de retornar el total de nodos en el grafo
    public int totalNodos(){
        return nodos.size();
    }

    // Método que se encarga de verificar si el nodo existe
    public static boolean existeNodo(NodoG nodoG){

        if (nodos.contains(nodoG)){
            return true;
        }

        return false;
    }

    // Método que se encarga de retornar los nodos (grafo) existentes en el grafo en formato String
    @Override
    public String toString(){

        return "\n \t Grafo [ Nodos = " + nodos + " ]";
    }
}