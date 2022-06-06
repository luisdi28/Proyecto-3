package Graph;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    // Atributo de la clase
    private static ArrayList<NodoG> nodos;

    // Método que se encarga de agregar nodos al grafo
    public void agregarNodo(NodoG nodoG){
        // Si la lista está vacía
        if (nodos == null){
            // Crea un nuevo ArrayList
            nodos = new ArrayList<>();
        }
        // Si no está vacía
        nodos.add(nodoG);
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