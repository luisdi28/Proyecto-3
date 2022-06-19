package AntVillageGUI;

import Algorithms.Dijkstra;
import Graph.ConstructorG;
import Graph.Grafo;

public class pruebaMain {

    public static void main() {
        ConstructorG constructorG = new ConstructorG();
        Grafo grafo;
        grafo = constructorG.crearGrafo(5);
        new pruebaHormiga(grafo, 0,0);

    }

}
