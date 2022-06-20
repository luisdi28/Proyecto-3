package AntNFood;

import AntVillageGUI.Bienvenida;
import AntVillageGUI.Juego5;
import AntVillageGUI.Juego7;
import AntVillageGUI.Juego9;
import Graph.Grafo;
import Graph.NodoG;

import javax.swing.*;

public class Comida {
    int comida_actual;
    private int Cx;
    private int Cy;

    public Comida(String modo_juego, int limite_alimento,  String color_hormiga) {

        if (modo_juego == "Juego 5") {
            if (color_hormiga == "verde") {
                comida_actual = Integer.parseInt(Juego5.getComida_verde()); //Se obtiene la comida actual y se convierte en int
                comida_actual++;                                                // Se le suma 1 a la comida
                Juego5.setComida_verde(String.valueOf(comida_actual));          //Se convierte en string la comida actualizada
                if (comida_actual == limite_alimento) {                         //Se verifica si llegaron al limite
                    JOptionPane.showMessageDialog(null, "El juego ha terminado, presione el botón Cerrar para salir");
                }
                else {
                    Juego5.reinicia_labels();
                    // Se debe llamar a la clase que se encarga de poner la comida en una aldea
                }
            }
            else {
                comida_actual = Integer.parseInt(Juego5.getComida_azul());
                comida_actual++;
                Juego5.setComida_azul(String.valueOf(comida_actual));
                if (comida_actual == limite_alimento) {
                    JOptionPane.showMessageDialog(null, "El juego ha terminado, presione el botón Cerrar para salir");
                }
                else{
                    Juego5.reinicia_labels();
                    // Se debe llamar a la clase que se encarga de poner la comida en una aldea
                }
            }
        }
        else if (modo_juego == "Juego 7") {
            if (color_hormiga == "verde") {
                comida_actual = Integer.parseInt(Juego7.getComida_verde()); //Se obtiene la comida actual y se convierte en int
                comida_actual++;                                                // Se le suma 1 a la comida
                Juego7.setComida_verde(String.valueOf(comida_actual));          //Se convierte en string la comida actualizada
                if (comida_actual == limite_alimento) {                         //Se verifica si llegaron al limite
                    JOptionPane.showMessageDialog(null, "El juego ha terminado, presione el botón Cerrar para salir");
                }
                else{
                    Juego7.reinicia_labels();
                    // Se debe llamar a la clase que se encarga de poner la comida en una aldea
                }
            } else {

                comida_actual = Integer.parseInt(Juego7.getComida_azul());
                comida_actual++;
                Juego7.setComida_azul(String.valueOf(comida_actual));
                if (comida_actual == limite_alimento) {
                    JOptionPane.showMessageDialog(null, "El juego ha terminado, presione el botón Cerrar para salir");
                }
                else{
                    Juego7.reinicia_labels();
                    // Se debe llamar a la clase que se encarga de poner la comida en una aldea
                }
            }
        }
        else{
            if (color_hormiga == "verde") {
                comida_actual = Integer.parseInt(Juego9.getComida_verde()); //Se obtiene la comida actual y se convierte en int
                comida_actual++;                                                // Se le suma 1 a la comida
                Juego9.setComida_verde(String.valueOf(comida_actual));          //Se convierte en string la comida actualizada
                if (comida_actual == limite_alimento) {                         //Se verifica si llegaron al limite
                    JOptionPane.showMessageDialog(null, "El juego ha terminado, presione el botón Cerrar para salir");
                }
                else{
                    Juego9.reinicia_labels();
                    // Se debe llamar a la clase que se encarga de poner la comida en una aldea
                }
            }
            else {
                comida_actual = Integer.parseInt(Juego9.getComida_azul());
                comida_actual++;
                Juego9.setComida_azul(String.valueOf(comida_actual));
                if (comida_actual == limite_alimento) {
                    JOptionPane.showMessageDialog(null, "El juego ha terminado, presione el botón Cerrar para salir");
                }
                else{
                    Juego9.reinicia_labels();
                    // Se debe llamar a la clase que se encarga de poner la comida en una aldea
                }
            }
        }
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

    public static void main() {
    }

}
