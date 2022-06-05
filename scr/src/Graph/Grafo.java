package Graph;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    // Atributo de la clase
    private List<NodoG> nodos;

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
    public List<NodoG> getNodos(){
        return nodos;
    }

    // Método que se encarga de retornar los nodos (grafo) existentes en el grafo en formato String
    @Override
    public String toString(){

        return "\n \t Grafo [ Nodos = " + nodos + " ]";
    }
}