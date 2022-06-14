package AntNFood;

import AntVillageGUI.Bienvenida;
import AntVillageGUI.Juego5;

import javax.swing.*;

public class Comida {

    public Comida(String modo_juego, int limite_alimento,  String color_hormiga) {

        if (modo_juego == "Juego 5") {
            if (color_hormiga == "verde") {
                String comida_actual = Juego5.getComida_verde();
                int comida1 = Integer.parseInt(comida_actual);
                comida1++;
                comida_actual = String.valueOf(comida1);
                Juego5.setComida_verde(comida_actual);
                if (comida1 == limite_alimento) {
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    new Juego5(limite_alimento).setVisible(false);
                    new Bienvenida().setVisible(true);
                }
                // Se debe llamar a la clase que se encarga de poner la comida en una aldea
            } else {
                if (color_hormiga == "azul") {
                    String comida_actual = Juego5.getComida_azul();
                    int comida1 = Integer.parseInt(comida_actual);
                    comida1++;
                    comida_actual = String.valueOf(comida1);
                    Juego5.setComida_azul(comida_actual);
                    if (comida1 == limite_alimento) {
                        JOptionPane.showMessageDialog(null, "El juego ha terminado");
                        new Juego5(limite_alimento).setVisible(false);
                        new Bienvenida().setVisible(true);
                    }
                }

            }
        }
        else if (modo_juego == "Juego 7") {
            if (color_hormiga == "verde") {
                String comida_actual = Juego5.getComida_verde();
                int comida1 = Integer.parseInt(comida_actual);
                comida1++;
                comida_actual = String.valueOf(comida1);
                Juego5.setComida_verde(comida_actual);
                if (comida1 == limite_alimento) {
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    new Juego5(limite_alimento).setVisible(false);
                    new Bienvenida().setVisible(true);
                }
                // Se debe llamar a la clase que se encarga de poner la comida en una aldea
            } else {
                if (color_hormiga == "azul") {
                    String comida_actual = Juego5.getComida_azul();
                    int comida1 = Integer.parseInt(comida_actual);
                    comida1++;
                    comida_actual = String.valueOf(comida1);
                    Juego5.setComida_azul(comida_actual);
                    if (comida1 == limite_alimento) {
                        JOptionPane.showMessageDialog(null, "El juego ha terminado");
                        new Juego5(limite_alimento).setVisible(false);
                        new Bienvenida().setVisible(true);
                    }
                }

            }
        }
        else{
            if (color_hormiga == "verde") {
                String comida_actual = Juego5.getComida_verde();
                int comida1 = Integer.parseInt(comida_actual);
                comida1++;
                comida_actual = String.valueOf(comida1);
                Juego5.setComida_verde(comida_actual);
                if (comida1 == limite_alimento) {
                    JOptionPane.showMessageDialog(null, "El juego ha terminado");
                    new Juego5(limite_alimento).setVisible(false);
                    new Bienvenida().setVisible(true);
                }
                // Se debe llamar a la clase que se encarga de poner la comida en una aldea
            } else {
                if (color_hormiga == "azul") {
                    String comida_actual = Juego5.getComida_azul();
                    int comida1 = Integer.parseInt(comida_actual);
                    comida1++;
                    comida_actual = String.valueOf(comida1);
                    Juego5.setComida_azul(comida_actual);
                    if (comida1 == limite_alimento) {
                        JOptionPane.showMessageDialog(null, "El juego ha terminado");
                        new Juego5(limite_alimento).setVisible(false);
                        new Bienvenida().setVisible(true);
                    }
                }

            }
        }




    }


    public static void main() {
    }
}