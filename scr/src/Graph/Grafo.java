package Graph;

import java.util.ArrayList;

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
    }

    // Método que se encarga de realizar la conexión entre dos nodos
    public void conectarNodos(NodoG nodoOrigen, NodoG nodoDestino, AristaH arista){

        // Condicional que conecta los nodos en caso de que el nodo destino no forme
        // parte de los nodos adyacentes al nodo origen
        if (!nodoOrigen.getAdyacentesLista().contains(nodoDestino)){
            nodoOrigen.agregarAristaNodos(arista, nodoDestino);
        }
    }

    // Método getter y setter del atributo nodos
    public ArrayList<NodoG> getNodos() {
        return nodos;
    }

    public static void setNodos(ArrayList<NodoG> nodos) {
        Grafo.nodos = nodos;
    }

    // Método que se encarga de retornar el total de nodos en el grafo
    public int totalNodos(){
        return nodos.size();
    }

    // Método que se encarga de verificar si el nodo existe
    public static boolean existeNodo(NodoG nodoG){

        // Retorna true en caso de que exista el nodo
        if (nodos.contains(nodoG)){
            return true;
        }

        // Retorna false en caso de que no exista el nodo
        return false;
    }

    // Método que se encarga de retornar la cantidad de nodos adyacentes que tiene el nodo dado
    public int grado(NodoG nodoG){
        return nodoG.getAdyacentesLista().size();
    }

    // Método que se encarga de mostrar los nodos adyacentes al nodo dado
    // Los muestra en un conjunto
    public String nodosAdyacentes(NodoG nodoG){
        return "\nClase --> Grafo --> Nodo --> " + nodoG.getSector() + "\nNodos Adyacentes:" + nodoG.getAdyacentes().toString().replace("{", "").replace("}", "").replace(",", "");
    }

    // Método que se encarga de retornar los nodos (grafo) existentes en el grafo en formato String
    @Override
    public String toString(){
        return nodos.toString().replace("[", "").replace("]", "").replace(",", "");
    }
}