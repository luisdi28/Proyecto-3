package Algorithms;

import Graph.AristaH;
import Graph.Grafo;
import Graph.NodoG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FuerzaBruta {

    // Atributos de la clase
    private HashMap<NodoG, Integer> nodos = new HashMap<NodoG, Integer>();
    private Grafo grafo;
    private ArrayList<NodoG> grafoVertices;
    private boolean continuar;
    private HashMap<NodoG, AristaH> aristas = new HashMap<NodoG, AristaH>();
    private Object[] adyacentes;

    public FuerzaBruta(Grafo grafo) {

        this.grafo = grafo;
        this.continuar = true;
    }
//esto deberia de estar
    public List rutaCostoMinimoFuerzaBruta(NodoG inicial) { //meterlo en interfaz?

        grafoVertices = grafo.getNodos();
        for (int i = 0; i < grafo.totalNodos(); i++) {
            nodos.put(grafoVertices.get(i), Integer.MAX_VALUE);
        }

        List<NodoG> ruta = new ArrayList<>();

        ruta.add(inicial);

        int contador = 3;
        NodoG nodoG = inicial;

        do {

            aristas = nodoG.getAdyacentes();
            adyacentes = nodoG.getAdyacentes().keySet().toArray();
            nodoG = obtenerMenor();
            //aca se llama a moverblue
            ruta.add(nodoG); //solo para imprimir
            nodoG.setVisitado(true);

            if (contador == 0){
                continuar = false;
            }

            contador--;

        } while (continuar == true);

        return ruta; //esto debe pasar directamente al moververde
    }

    private NodoG obtenerMenor() {

        Integer menor = Integer.MAX_VALUE;
        Integer aux;
        NodoG nodoMenor = null;
        AristaH nodoAux;

        for (int i = 0; i < aristas.size(); i++) {

            nodoAux = aristas.get(adyacentes[i]);

            aux = aristas.get(adyacentes[i]).getDistancia();

            if (aux <= menor && grafoVertices.get(i).isVisitado() == false) {

                menor = aux;
                nodoMenor = (NodoG) adyacentes[i];
            }
        }

        return nodoMenor;
    }
/*
    private boolean recorrido() {

        for (int i = 0; i < aristas.size(); i++) {
            if (!aristas.get(i).isVisitado() == true) {
                return false;
            }
        }
        return true;
    }

 */
}