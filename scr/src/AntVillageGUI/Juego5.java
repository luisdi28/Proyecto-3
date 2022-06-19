package AntVillageGUI;

import Algorithms.Dijkstra;
import AntNFood.Comida;
import AntNFood.Hormiga;
import Graph.ConstructorG;
import Graph.Grafo;
import Graph.NodoG;
import Lists.listaNormal;
import rsscalelabel.RSScaleLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.List;

public class Juego5 extends JFrame implements ActionListener {

    String hormiguero = "imagenes/imagen1.png";
    String comida_juego = "imagenes/Comida.png";
    boolean flag_comida = false;

    private Hormiga hormiga;
    private Comida comida;
    ConstructorG constructorG = new ConstructorG();
    Grafo grafo;

    private List list;

    private int x, y, Gx, Gy, iteraciones;
    private Image enemy;
    private boolean flag;
    private listaNormal listanormal;


    public Juego5(int alimento) {
        grafo = constructorG.crearGrafo(5);

        initComponents();

        Comida_Esco.setText(String.valueOf(alimento));
        Comida_azul.setText("0");
        Comida_verde.setText("0");

        RSScaleLabel.setScaleLabel(A, hormiguero);
        RSScaleLabel.setScaleLabel(B, hormiguero);
        RSScaleLabel.setScaleLabel(C, hormiguero);
        RSScaleLabel.setScaleLabel(D, hormiguero);
        RSScaleLabel.setScaleLabel(E, hormiguero);

        Timer timer = new Timer(500,this);
        timer.start();

        x = 0;
        y = 0;
        Gx = 0;
        Gy = 0;
        iteraciones = 0;
        flag = false;

        enemy = new ImageIcon("imagenes\\hormiga verde.png").getImage();
    }

    public Juego5() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        panelJuego = new JPanel();
        Comida_A = new JLabel();
        A = new JLabel();
        Nombre_A = new JLabel();
        Comida_B = new JLabel();
        B = new JLabel();
        Nombre_B = new JLabel();
        Comida_C = new JLabel();
        C = new JLabel();
        Nombre_C = new JLabel();
        Comida_D = new JLabel();
        D = new JLabel();
        Nombre_D = new JLabel();
        Comida_E = new JLabel();
        E = new JLabel();
        Nombre_E = new JLabel();
        panelInfo = new JPanel();
        Cantidad = new JLabel();
        Comida_Esco = new JLabel();
        Hormiga_v = new JLabel();
        Hormiga_a = new JLabel();
        Comida_azul = new JLabel();
        Comida_verde = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new Color(102, 102, 102));
        setResizable(false);

        panelJuego.setBackground(new Color(161, 130, 98));
        panelJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Comida_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Comida_AMouseClicked(evt);
            }
        });
        Comida_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Comida_BMouseClicked(evt);
            }
        });
        Comida_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Comida_CMouseClicked(evt);
            }
        });
        Comida_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Comida_DMouseClicked(evt);
            }
        });
        Comida_E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Comida_EMouseClicked(evt);
            }
        });

        panelJuego.add(Comida_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 100, 100));
        panelJuego.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 100, 100));

        Nombre_A.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Nombre_A.setText("A");
        panelJuego.add(Nombre_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        panelJuego.add(Comida_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 100, 100));
        panelJuego.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 100, 100));

        Nombre_B.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Nombre_B.setText("B");
        panelJuego.add(Nombre_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 100, 100));

        panelJuego.add(Comida_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 100, 100));
        panelJuego.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 100, 100));

        Nombre_C.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Nombre_C.setText("C");
        panelJuego.add(Nombre_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 100, 100));

        panelJuego.add(Comida_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 100, 100));
        panelJuego.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 100, 100));

        Nombre_D.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Nombre_D.setText("D");
        panelJuego.add(Nombre_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 100, 100));

        panelJuego.add(Comida_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 100, 100));
        panelJuego.add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 100, 100));

        Nombre_E.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Nombre_E.setText("E");
        panelJuego.add(Nombre_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 380, 100, 100));

        panelInfo.setBackground(new Color(0, 102, 102));
        panelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cantidad.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Cantidad.setText("Cantidad de comida escogida:");
        panelInfo.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Comida_Esco.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Comida_Esco.setText(".....");
        panelInfo.add(Comida_Esco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        Hormiga_a.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Hormiga_a.setText("Hormigas Azules:");
        panelInfo.add(Hormiga_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        Comida_azul.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Comida_azul.setText(".....");
        panelInfo.add(Comida_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        Comida_verde.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Comida_verde.setText(".....");
        panelInfo.add(Comida_verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 34, -1));

        Hormiga_v.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        Hormiga_v.setText("Hormigas Verdes:");
        panelInfo.add(Hormiga_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));


        panelJuego.add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelJuego, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelJuego, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void Comida_AMouseClicked(MouseEvent evt) {
        if (flag_comida == false){
            flag_comida=true;
            RSScaleLabel.setScaleLabel(Comida_A, comida_juego);
           // grafo = constructorG.crearGrafo(5);
            // dijkstra = new Dijkstra(grafo);
            //List list = dijkstra.rutaCostoMinimoDijkstra(grafo.getNodos().get(4) , grafo.getNodos().get(1));
            setList(list);
            setListanormal();
            moverVerde();
            setFlag();
        }
        else{
            reinicia_labels();
            RSScaleLabel.setScaleLabel(Comida_A, comida_juego);
        }

    }

    private void Comida_BMouseClicked(MouseEvent evt) {
        if (flag_comida == false){
            flag_comida=true;
            RSScaleLabel.setScaleLabel(Comida_B, comida_juego);
        }
        else{
            reinicia_labels();
            RSScaleLabel.setScaleLabel(Comida_B, comida_juego);
        }

    }

    private void Comida_CMouseClicked(MouseEvent evt) {
        if (flag_comida == false){
            flag_comida=true;
            RSScaleLabel.setScaleLabel(Comida_C, comida_juego);
        }
        else{
            reinicia_labels();
            RSScaleLabel.setScaleLabel(Comida_C, comida_juego);
        }
    }

    private void Comida_DMouseClicked(MouseEvent evt) {
        if (flag_comida == false){
            flag_comida=true;
            RSScaleLabel.setScaleLabel(Comida_D, comida_juego);
        }
        else{
            reinicia_labels();
            RSScaleLabel.setScaleLabel(Comida_D, comida_juego);
        }
    }

    private void Comida_EMouseClicked(MouseEvent evt) {
        if (flag_comida == false){
            flag_comida=true;
            RSScaleLabel.setScaleLabel(Comida_E, comida_juego);
        }
        else{
            reinicia_labels();
            RSScaleLabel.setScaleLabel(Comida_E, comida_juego);
        }
    }

    public static String getComida_verde() {
        return Comida_verde.getText();
    }

    public static void setComida_verde(String comida_verde) {
        Comida_verde.setText(comida_verde);
    }

    public static String getComida_azul() {
        return Comida_azul.getText();
    }

    public static void setComida_azul(String comida_azul) {
        Comida_azul.setText(comida_azul);
    }

    public boolean isFlag_comida() {
        return flag_comida;
    }

    public void setFlag_comida(boolean flag_comida) {
        this.flag_comida = flag_comida;
    }

    public static void reinicia_labels(){
        RSScaleLabel.setScaleLabel(Comida_A, null);
        RSScaleLabel.setScaleLabel(Comida_B, null);
        RSScaleLabel.setScaleLabel(Comida_C, null);
        RSScaleLabel.setScaleLabel(Comida_D, null);
        RSScaleLabel.setScaleLabel(Comida_E, null);
    }

    public void setList(List list){
        this.list = list;
    }

    public void setFlag(){
        this.flag = true;
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D G2D = (Graphics2D) g;
        G2D.drawImage(enemy, Gx, Gy, null);
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego5().setVisible(true);
            }
        });
    }

    private JLabel Cantidad;
    private JLabel Comida_Esco;
    private static JLabel Comida_azul;
    private static JLabel Comida_verde;
    private JLabel Hormiga_a;
    private JLabel Hormiga_v;

    private JLabel Nombre_A;
    private JLabel Nombre_B;
    private JLabel Nombre_C;
    private JLabel Nombre_D;
    private JLabel Nombre_E;

    private JLabel A;
    private JLabel B;
    private JLabel C;
    private JLabel D;
    private JLabel E;

    private static JLabel Comida_A;
    private static JLabel Comida_B;
    private static JLabel Comida_C;
    private static JLabel Comida_D;
    private static JLabel Comida_E;

    private JPanel panelInfo;
    private JPanel panelJuego;
    // End of variables declaration
}
