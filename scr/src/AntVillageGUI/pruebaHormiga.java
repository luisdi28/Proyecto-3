package AntVillageGUI;

import Graph.Grafo;
import Graph.NodoG;
import Lists.listaNormal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class pruebaHormiga extends JPanel implements ActionListener {
    private List list;
    final int alto = 500;
    final int ancho = 600;
    Image enemy;
    Image enemy2;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x;
    int y ;
    int iteraciones = 0;
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
    private int Gy ;
    private boolean flag = false;
    private listaNormal listanormal;

    // Constructor de la clase
    public pruebaHormiga(Grafo grafo, int posicion_x, int posicion_y) {
        this.grafo = grafo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.recorridos = new ArrayList<>();
        this.recolectado = 0;
        this.posicion_x = posicion_x;
        this.posicion_y = posicion_y;
        //ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(tipo));
        //this.image = imageIcon.getImage();
        this.setPreferredSize(new Dimension(ancho, alto));
        //this.setBackground(Color.black);
        enemy = new ImageIcon("imagenes\\hormiga verde.png").getImage();
        enemy2 = new ImageIcon("imagenes\\hormiga azul.png").getImage();
        this.x = 0;
        this.y = 0;
        this.Gx = 0;
        this.Gy = 0;
        timer = new Timer(20, this);
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
    public int totalRecorridos() {
        return recorridos.size();
    }

    // Métodos de lógica
    // Método que se encarga de mover la hormiga mediante el algoritmo de Dikstra
    public void setList(List list){
        this.list = list;
    }
    public void setFlag(){
        this.flag = true;
    }
    public void moverHormigaVerde(List list) {
        NodoG nodoG;
        NodoG punto;
        int x, y;
        int i = 0;
        while (i < list.size()) {
            if (flag == true) {
                int j = 0;
                System.out.println("el tamaño de la lista es" + list.size());
                System.out.println("la iteracion es = " + i);
                System.out.println("el j es:" + j);
                System.out.println("el nodo de grafos es:" + grafo.totalNodos());
                //System.out.println("la flag es:" + flag);
                while (j < grafo.totalNodos()) {
                    if (flag == true) {
                        //System.out.println("flag verdadera");
                        nodoG = grafo.getNodos().get(j);    // Toma el valor del nodo (Grafo)
                        punto = (NodoG) list.get(i);       // Toma el valor del punto (Lista de puntos)
                        if (nodoG.equals(punto) == true) {   // Si ambos valores son iguales
                            System.out.println("se encontro un destino");
                            System.out.println("el sector a moverse es: " + nodoG);

                            this.x = nodoG.getPosicion_x();      // Toma el valor x del nodo
                            this.y = nodoG.getPosicion_y();
                            flag = false;
                            System.out.println("posicion x= " + this.x);
                            System.out.println("posicion y= " + this.y);
                            j += 1;
                        } else {
                            //System.out.println("se suma 1");
                            j += 1;
                        }
                    }
                }
                i+=1;
            }
            else{

            }
        }
    }
    public void moverVerde(){

        NodoG nodoG;
        NodoG punto;
        int x, y;
        for (int i = 0; i < list.size(); i++){                  // Lista de puntos
            for (int j = 0; j < grafo.totalNodos(); j++){       // ArrayList de nodos

                nodoG = grafo.getNodos().get(j);    // Toma el valor del nodo (Grafo)
                punto = (NodoG) list.get(i);       // Toma el valor del punto (Lista de puntos)

                if (nodoG.equals(punto) == true){   // Si ambos valores son iguales

                    x = nodoG.getPosicion_x();      // Toma el valor x del nodo
                    y = nodoG.getPosicion_y();      // Toma el valor y del nodo
                    moverHGreen(x, y);              // Llama al método
                    System.out.println("x" + x + "y" + y);
                }
            }
        }
        flag = false;
    }

    // Método que se encarga de mover y actualizar la posición de la hormiga Verde
    public void moverHGreen(int x, int y) {
        listanormal.insertFirst(x,y);
    }
    public void setListanormal(){
        this.listanormal = new listaNormal();
    }
    public void checkIteraciones(){
        if (iteraciones == listanormal.getSize()){
            flag=false;
            iteraciones=0;
            listanormal = null;
        }
    }
    public void getListanormal(){
        listanormal.displayList();
    }

    // Método que se encarga de mover la hormiga mediante el algoritmo de fuerza bruta
    public void moverHormigaVAzul(int x, int y) {
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D G2D = (Graphics2D) g;
        G2D.drawImage(enemy , Gx ,Gy , null);
        //G2D.drawImage(enemy2 , x2 ,y2 , null);
    }
    //lo que debo hacer es guardar una lista de las posiciones del ciclo for
    //en una variable lista, tener una variable n
    //tener variables x , y de destino(de la lista)
    //tener una funcion que asigne las variables de las listas a las x , y
    //tener un flag en la variable que asigna
    //utilizar el timer con esas variables, cuando llega el timer se pone la flag en false, y regresa
    //al while loop para asignar x y y leer la lista,similar a lo que ya tenemos hecho con las flags 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (flag == true) {
            if (iteraciones != listanormal.getSize()) {
                x = listanormal.buscarx(iteraciones);
                y = listanormal.buscary(iteraciones);
                if (Gx != x || Gy != y) {
                    if (Gx == x && Gy < y) {
                        Gy += 1;
                        repaint();
                    }
                    if (Gx == x && Gy > y) {
                        Gy -= 1;
                        repaint();
                    }
                    if (Gy == y && Gx < x) {
                        Gx += 1;
                        repaint();
                    }
                    if (Gy == y && Gx > x) {
                        Gx -= 1;
                        repaint();
                    }
                    if (Gx > x && Gy < y) {
                        Gx = Gx - 1;
                        Gy += 1;
                        repaint();
                    } else if (Gx < x && Gy > y) {
                        Gx = Gx + 1;
                        Gy -= 1;
                        repaint();
                    } else if (Gx < x && Gy < y) {
                        Gx += 1;
                        Gy += 1;
                        repaint();
                    } else {
                        Gx -= 1;
                        Gy -= 1;
                        repaint();
                    }
                } else {
                    iteraciones += 1;
                }
            } else {

                System.out.println("el x es:" + Gx + " el y es:" + Gy);
                checkIteraciones();
                flag = false;
            }

        }
        repaint();
    }
    // ####################### Métodos de prueba agenos a la lógica de la clase Hormiga ####################### //

        // Método que se encarga de mostrar los recorridos de cada hormiga

}