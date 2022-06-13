package AntNFood;

import javax.swing.*;
import java.awt.Image;
import java.util.ArrayList;

public class Hormiga{

    // Atributos de la clase

    private String tipo;                // Determina el tipo de hormiga (Azul o Verde) Ejemplo: "HormigaAzul.png"
    private ArrayList recorridos;       // Cada índice cuenta con su respectivo numero de recorrido y los sectores
    private int recolectado;            // Guarda cúanta comida ha recolectado
    private int posicion_x;             // Posicion x de la imagen
    private int posicion_y;             // Posicion y de la imagen
    private int posicion_dx;            // Posicion dx de la imagen
    private int posicion_dy;            // Posicion dy de la imagen
    private Image image;                // Imagen

    // Constructor de la clase
    public Hormiga(String tipo, int posicion_x, int posicion_y, int posicion_dx, int posicion_dy){

        this.tipo = tipo;
        this.recorridos = new ArrayList<>();
        this.recolectado = 0;
        this.posicion_x = posicion_x;
        this.posicion_y = posicion_y;
        this.posicion_dx = posicion_dx;
        this.posicion_dy = posicion_dy;
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(tipo));
        this.image = imageIcon.getImage();
    }

    // Métodos getter y setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(ArrayList recorridos) {
        this.recorridos = recorridos;
    }

    public int getRecolectado() {
        return recolectado;
    }

    public void setRecolectado(int recolectado) {
        this.recolectado = recolectado;
    }

    public int getPosicion_x() {
        return posicion_x;
    }

    public void setPosicion_x(int posicion_x) {
        this.posicion_x = posicion_x;
    }

    public int getPosicion_y() {
        return posicion_y;
    }

    public void setPosicion_y(int posicion_y) {
        this.posicion_y = posicion_y;
    }

    public int getPosicion_dx() {
        return posicion_dx;
    }

    public void setPosicion_dx(int posicion_dx) {
        this.posicion_dx = posicion_dx;
    }

    public int getPosicion_dy() {
        return posicion_dy;
    }

    public void setPosicion_dy(int posicion_dy) {
        this.posicion_dy = posicion_dy;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    
}