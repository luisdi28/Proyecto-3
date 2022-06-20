package AntNFood;

import Graph.Grafo;
import Graph.NodoG;

public class comidaP {
    int comida_actual;
    private int Cx;
    private int Cy;
    public comidaP(int x , int y){
        this.Cx = x;
        this.Cy = y;
    }
    public int getPosicion_x() {
        return this.Cx;
    }
    public int getPosicion_y() {
        return this.Cy;
    }
    public void setComida(int x , int y){
        this.Cx = x;
        this.Cy = y;
    }
    public NodoG obtenerNodo(Grafo grafo) {

        int i = 0;
        int cX = getPosicion_x();
        int cY = getPosicion_y();

        NodoG nodoAux = null;

        for (i = 0; i < grafo.totalNodos(); i++) {

            nodoAux = grafo.getNodos().get(i);

            if (cX == nodoAux.getPosicion_x() && cY == nodoAux.getPosicion_y()) {
                break;
            }
        }

        return nodoAux;
    }
}
