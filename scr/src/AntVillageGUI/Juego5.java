package AntVillageGUI;

import javax.swing.*;

public class Juego5 extends javax.swing.JFrame {

    String hormiguero = "imagenes/imagen1.png";
    String comida_juego = "imagenes/Comida.png";

    public Juego5(int alimento) {

        initComponents();

        Comida_Esco.setText(String.valueOf(alimento));

        rsscalelabel.RSScaleLabel.setScaleLabel(A, hormiguero);
        rsscalelabel.RSScaleLabel.setScaleLabel(B, hormiguero);
        rsscalelabel.RSScaleLabel.setScaleLabel(C, hormiguero);
        rsscalelabel.RSScaleLabel.setScaleLabel(D, hormiguero);
        rsscalelabel.RSScaleLabel.setScaleLabel(E, hormiguero);
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

        panelJuego = new javax.swing.JPanel();
        Comida_A = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        Nombre_A = new javax.swing.JLabel();
        Comida_B = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        Nombre_B = new javax.swing.JLabel();
        Comida_C = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        Nombre_C = new javax.swing.JLabel();
        Comida_D = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        Nombre_D = new javax.swing.JLabel();
        Comida_E = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        Nombre_E = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        Cantidad = new javax.swing.JLabel();
        Comida_Esco = new javax.swing.JLabel();
        Hormiga_v = new javax.swing.JLabel();
        Hormiga_a = new javax.swing.JLabel();
        Comida_azul = new javax.swing.JLabel();
        Comida_verde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        panelJuego.setBackground(new java.awt.Color(161, 130, 98));
        panelJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Comida_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Comida_AMouseClicked(evt);
            }
        });
        Comida_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Comida_BMouseClicked(evt);
            }
        });
        Comida_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Comida_CMouseClicked(evt);
            }
        });
        Comida_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Comida_DMouseClicked(evt);
            }
        });
        Comida_E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Comida_EMouseClicked(evt);
            }
        });

        panelJuego.add(Comida_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 80, 80));
        panelJuego.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 100, 100));

        Nombre_A.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Nombre_A.setText("A");
        panelJuego.add(Nombre_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 100));

        panelJuego.add(Comida_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 80, 80));
        panelJuego.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 100, 100));

        Nombre_B.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Nombre_B.setText("B");
        panelJuego.add(Nombre_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 100, 100));

        panelJuego.add(Comida_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 80, 80));
        panelJuego.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 100, 100));

        Nombre_C.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Nombre_C.setText("C");
        panelJuego.add(Nombre_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 100, 100));

        panelJuego.add(Comida_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 80, 80));
        panelJuego.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 100, 100));

        Nombre_D.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Nombre_D.setText("D");
        panelJuego.add(Nombre_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 100, 100));

        panelJuego.add(Comida_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 80, 80));
        panelJuego.add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 100, 100));

        Nombre_E.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Nombre_E.setText("E");
        panelJuego.add(Nombre_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 380, 100, 100));

        panelInfo.setBackground(new java.awt.Color(0, 102, 102));
        panelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cantidad.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Cantidad.setText("Cantidad de comida escogida:");
        panelInfo.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Comida_Esco.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Comida_Esco.setText(".....");
        panelInfo.add(Comida_Esco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        Hormiga_a.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Hormiga_a.setText("Hormigas Azules:");
        panelInfo.add(Hormiga_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        Comida_azul.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Comida_azul.setText(".....");
        panelInfo.add(Comida_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        Comida_verde.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Comida_verde.setText(".....");
        panelInfo.add(Comida_verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 34, -1));

        Hormiga_v.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Hormiga_v.setText("Hormigas Verdes:");
        panelInfo.add(Hormiga_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));


        panelJuego.add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void Comida_AMouseClicked(java.awt.event.MouseEvent evt) {
        rsscalelabel.RSScaleLabel.setScaleLabel(Comida_A, comida_juego);
    }

    private void Comida_BMouseClicked(java.awt.event.MouseEvent evt) {
        rsscalelabel.RSScaleLabel.setScaleLabel(Comida_B, comida_juego);
    }

    private void Comida_CMouseClicked(java.awt.event.MouseEvent evt) {
        rsscalelabel.RSScaleLabel.setScaleLabel(Comida_C, comida_juego);
    }

    private void Comida_DMouseClicked(java.awt.event.MouseEvent evt) {
        rsscalelabel.RSScaleLabel.setScaleLabel(Comida_D, comida_juego);
    }

    private void Comida_EMouseClicked(java.awt.event.MouseEvent evt) {
        rsscalelabel.RSScaleLabel.setScaleLabel(Comida_E, comida_juego);
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Nombre_A;
    private javax.swing.JLabel Nombre_B;
    private javax.swing.JLabel Nombre_C;
    private javax.swing.JLabel Nombre_D;
    private javax.swing.JLabel Nombre_E;
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Comida_A;
    private javax.swing.JLabel Comida_B;
    private javax.swing.JLabel Comida_C;
    private javax.swing.JLabel Comida_D;
    private javax.swing.JLabel Comida_E;
    private javax.swing.JLabel Comida_Esco;
    private static javax.swing.JLabel Comida_azul;
    private static javax.swing.JLabel Comida_verde;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JLabel Hormiga_a;
    private javax.swing.JLabel Hormiga_v;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelJuego;
    // End of variables declaration
}
