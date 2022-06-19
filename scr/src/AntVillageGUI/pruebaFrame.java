package AntVillageGUI;

import Algorithms.Dijkstra;
import Graph.ConstructorG;
import Graph.Grafo;

import javax.swing.*;
import java.util.List;

public class pruebaFrame extends JFrame {
    pruebaHormiga panel;
    ConstructorG constructorG = new ConstructorG();
    Grafo grafo;
    pruebaFrame(){
        grafo = constructorG.crearGrafo(5);
        //panel2 = new pruebaGUI();
        panel = new pruebaHormiga(grafo , 0 , 0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
       // Dijkstra dijkstra = new Dijkstra(grafo);
        //aca se puede hacer el timer de esperar 20 segundos.
        //List list = dijkstra.rutaCostoMinimoDijkstra(grafo.getNodos().get(4) , grafo.getNodos().get(1));
        //System.out.println(list);
        //panel.setList(list);
        panel.setListanormal();
        panel.moverVerde();
        panel.setFlag();
    }
}
