package AntNFood;

import AntVillageGUI.Bienvenida;
import AntVillageGUI.Juego5;
import AntVillageGUI.Juego7;
import AntVillageGUI.Juego9;

import javax.swing.*;

public class Comida {

    int alimento;
    int alimento_verde;
    int alimento_azul;
    String modo_juego;

    public Comida(String modo_juego) {

        alimento_azul = 0;
        alimento_verde = 0;
        //System.out.println("La cantidad de comida de las hormigas verdes es: "+ alimento_verde);
        //System.out.println("La cantidad de comida de las hormigas azules es: "+ alimento_azul);

        if (alimento_verde == alimento){
            if (modo_juego == "Juego 5"){
                JOptionPane.showMessageDialog(null, "El juego ha terminado");
                new Juego5(alimento).setVisible(false);
                new Bienvenida().setVisible(true);
            }
            else if (modo_juego == "Juego 7"){
                JOptionPane.showMessageDialog(null, "El juego ha terminado");
                new Juego7(alimento).setVisible(false);
                new Bienvenida().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "El juego ha terminado");
                new Juego9(alimento).setVisible(false);
                new Bienvenida().setVisible(true);
            }
        }
    }

    public static void main() {
    }
}