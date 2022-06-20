package Algorithms;

import Graph.AristaH;
import Graph.Grafo;
import Graph.NodoG;
import ManejoDeArchivos.Archivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FuerzaBruta {

    // Atributos de la clase
    private HashMap<NodoG, Integer> nodos = new HashMap<NodoG, Integer>();
    private Grafo grafo;
    private ArrayList<NodoG> grafoVertices;
    private boolean continuar;
    private Archivo archivo;
    String texto;

    public FuerzaBruta(Grafo grafo) {

        this.grafo = grafo;
        this.continuar = true;
        texto = "";
        archivo = new Archivo();
    }

    public List rutaCostoMinimoFuerzaBruta(NodoG inicial) {

        grafoVertices = grafo.getNodos();
        for (int i = 0; i < grafo.totalNodos(); i++) {
            nodos.put(grafoVertices.get(i), Integer.MAX_VALUE);
        }

        List<NodoG> ruta = new ArrayList<>();

        ruta.add(inicial);

        int x, y;
        NodoG nodoG;
        HashMap<NodoG, AristaH> aristas = null;

        do {

            // Se obtiene el nodo menor
            nodoG = obtenerMenor();

            // Se agrega en la lista del registro
            ruta.add(nodoG);
            nodoG.setVisitado(true);

            // Se obtienen las posiciones del nodo retornado
            x = nodoG.getPosicion_x();
            y = nodoG.getPosicion_y();

            // Se llama al método que mueve la imagen
            moverHBlue(x, y);

        } while (recorrido() == false);

        // No se toma en cuenta
        // Se escribe en el txt
        texto = "\nRuta calculada efectuada mediante el algoritmo de Fuerza Bruta: \n" + ruta.toString().replace("[", "").replace("]", "").replace(",", "");
        archivo.escribir(texto);
        return ruta;
    }

    // Método que se encarga de obtener el menor
    private NodoG obtenerMenor() {

        Integer menor = Integer.MAX_VALUE;
        Integer aux;
        NodoG nodoMenor = null;
        NodoG nodoAux;

        HashMap<NodoG, AristaH> aristas;

        for (int i = 0; i < grafo.totalNodos(); i++) {

            aux = nodos.get(grafoVertices.get(i));

            if (aux <= menor && grafoVertices.get(i).isVisitado() == false) {

                menor = aux;
                nodoMenor = grafoVertices.get(i);
            }
        }

        return nodoMenor;
    }

    private boolean recorrido() {

        for (int i = 0; i < grafo.totalNodos(); i++) {
            if (grafoVertices.get(i).isVisitado() == false) {
                return false;
            }
        }
        return true;
    }

    public void moverHBlue(int x, int y){

        System.out.println("X: " + x + " Y: " + y);

    }
}