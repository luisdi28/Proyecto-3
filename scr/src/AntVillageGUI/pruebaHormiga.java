package AntVillageGUI;

import Graph.Arista;
import Graph.Grafo;
import Graph.NodoG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class pruebaHormiga extends JPanel implements ActionListener {
    final int alto = 500;
    final int ancho = 600;
    Image enemy;
    Image enemy2;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x =0;
    int y = 0;
    int x2 =0;
    int y2 = 0;

    // Atributos de la clase
    private Grafo grafo;
    private String nombre;              // Nombre para identificar la hormiga, útil para el método mostrarInfo()
    private String tipo;                // Determina el tipo de hormiga (Azul o Verde) Ejemplo: "HormigaAzul.png"
    private ArrayList recorridos;       // Cada índice cuenta con su respectivo numero de recorrido y los sectores
    private int recolectado;            // Guarda cúanta comida ha recolectado
    private int posicion_x;             // Posicion x de la imagen
    private int posicion_y;             // Posicion y de la imagen
    private int posicion_dx;            // Posicion dx de la imagen
    private int posicion_dy;            // Posicion dy de la imagen
    private Image image;                // Imagen
    private int Gx;
    private int Gy;
    private boolean flag = false;
    // Constructor de la clase
    public pruebaHormiga(Grafo grafo, int posicion_x, int posicion_y){

        this.grafo = grafo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.recorridos = new ArrayList<>();
        this.recolectado = 0;
        this.posicion_x = posicion_x;
        this.posicion_y = posicion_y;
        //ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(tipo));
        //this.image = imageIcon.getImage();
        this.setPreferredSize(new Dimension(ancho,alto));
        this.setBackground(Color.black);
        enemy = new ImageIcon("imagenes\\hormiga verde.png").getImage();
        enemy2 = new ImageIcon("imagenes\\hormiga azul.png").getImage();
        timer = new Timer(10 , this);
        timer.start();
    }

    // Métodos getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    // Método que se encarga de retornar el tamaño del ArrayList
    public int totalRecorridos(){
        return recorridos.size();
    }

    // Métodos de lógica
    // Método que se encarga de mover la hormiga mediante el algoritmo de Dikstra
    public void moverHormigaVerde(List list){

        NodoG nodoG;
        NodoG punto;
        int x, y;
        for (int i = 0; i < list.size(); i++){                  // Lista de puntos
            for (int j = 0; j < grafo.totalNodos(); j++){
                nodoG = grafo.getNodos().get(j);    // Toma el valor del nodo (Grafo)
                punto = (NodoG) list.get(i);       // Toma el valor del punto (Lista de puntos)
                if (nodoG.equals(punto) == true){   // Si ambos valores son iguales

                    x = nodoG.getPosicion_x();      // Toma el valor x del nodo
                    y = nodoG.getPosicion_y();      // Toma el valor y del nodo
                    
                    moverHVerde(x, y);              // Llama al método
                }
            }
        }
    }

    // Método que se encarga de mover y actualizar la posición de la hormiga Verde
    public void moverHVerde(int x, int y){
        while (Gx != x && Gy != y){
            if (Gx>x && Gy < y){
                Gx = Gx-1;
                Gy+=1;
                repaint();
            }
            else if(Gx<x && Gy > y){
                Gx = Gx+1;
                Gy-=1;
                repaint();
            }
            else if(Gx<x && Gy < y){
                Gx +=1;
                Gy +=1;
                repaint();
            }
            else{
                Gx -=1;
                Gy -=1;
                repaint();
            }
        }
        flag = false;
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D G2D = (Graphics2D) g;
        G2D.drawImage(enemy , Gx ,Gy , null);
        //G2D.drawImage(enemy2 , x2 ,y2 , null);
    }

    // Método que se encarga de mover la hormiga mediante el algoritmo de fuerza bruta
    public void moverHormigaVAzul(){


    }

    // ####################### Métodos de prueba agenos a la lógica de la clase Hormiga ####################### //

    // Método que se encarga de mostrar los recorridos de cada hormiga
    public String mostrarRecorridos(){

        for (int i = 0; i < totalRecorridos(); i++){

            System.out.println("Recorrido: " + i + 1);
            System.out.println("Sectores visitados: ");

            List list = (List) recorridos.get(i);

            for (int j = 0; j < list.size(); j++){
                System.out.print(list.get(i) + " -> ");
            }
        }
        return mostrarRecorridos();
    }

    // Método que se encarga de mostrar toda la información necesario con respecto a la hormiga
    public String mostrarInfo(){

        String registro = mostrarRecorridos();

        return  "\n Hormiga: " + nombre +
                "\n Comida recolectada: " + recolectado +
                "\n Registro de movimiento: " +
                "\n" + registro;
    }

    @Override
    public void actionPerformed(ActionEvent e) { // meto el recorrer nodo en el timer

    }

    // ####################### Métodos de prueba agenos a la lógica de la clase Hormiga ####################### //

}