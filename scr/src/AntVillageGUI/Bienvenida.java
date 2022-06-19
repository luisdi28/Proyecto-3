package AntVillageGUI;

import javax.swing.*;

public class Bienvenida extends JFrame {

    String alimen;
    String modo_juego;
    int alimento;

    /**
     * Creates new form Bienvenida
     */
    public Bienvenida() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        categorias = new ButtonGroup();
        panelPresentacion = new JPanel();
        Bienvenida = new JLabel();
        Escogencia_A = new JLabel();
        ali = new JTextField();
        Escogencia_C = new JLabel();
        Boton_validar = new JButton();
        elegir_grafo3 = new JRadioButton();
        elegir_grafo1 = new JRadioButton();
        elegir_grafo2 = new JRadioButton();
        Boton_registro_partidas = new JButton();
        Historial = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("ventana_bienvenida");
        setResizable(false);

        panelPresentacion.setBackground(new java.awt.Color(0, 153, 153));

        Bienvenida.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Bienvenida.setText("Bienvenid@ a AntVillage");

        Escogencia_A.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Escogencia_A.setText("Digite la cantidad de alimento que desea para la partida, debe ser igual o menor a 5.");

        ali.setBackground(new java.awt.Color(102, 102, 102));
        ali.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Escogencia_C.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Escogencia_C.setText("Escoga UNA de las categorias dadas");

        Boton_validar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Boton_validar.setText("Jugar");
        Boton_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_validarActionPerformed(evt);
            }
        });

        categorias.add(elegir_grafo3);
        elegir_grafo3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        elegir_grafo3.setText("Grafo de 9 nodos");

        categorias.add(elegir_grafo1);
        elegir_grafo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        elegir_grafo1.setText("Grafo de 5 nodos");

        categorias.add(elegir_grafo2);
        elegir_grafo2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        elegir_grafo2.setText("Grafo de 7 nodos");

        Boton_registro_partidas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Boton_registro_partidas.setText("Historial de partidas");
        Boton_registro_partidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_registro_partidasActionPerformed(evt);
            }
        });

        Historial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Historial.setText("Si desea ver el historial de partidas puede acceder por medio del siguiente botón");

        GroupLayout panelPresentacionLayout = new GroupLayout(panelPresentacion);
        panelPresentacion.setLayout(panelPresentacionLayout);
        panelPresentacionLayout.setHorizontalGroup(
                panelPresentacionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                .addGroup(panelPresentacionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(elegir_grafo1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(elegir_grafo2)
                                                .addGap(80, 80, 80)
                                                .addComponent(elegir_grafo3))
                                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                                .addGroup(panelPresentacionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                                                .addGap(234, 234, 234)
                                                                .addComponent(Bienvenida))
                                                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(Escogencia_A)))
                                                .addGap(0, 4, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelPresentacionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                                .addComponent(Historial)
                                                .addGap(23, 23, 23))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                                .addComponent(Boton_registro_partidas)
                                                .addGap(235, 235, 235))))
                        .addGroup(GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelPresentacionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                                .addComponent(ali, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                .addGap(304, 304, 304))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                                .addComponent(Escogencia_C)
                                                .addGap(191, 191, 191))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                                .addComponent(Boton_validar)
                                                .addGap(289, 289, 289))))
        );
        panelPresentacionLayout.setVerticalGroup(
                panelPresentacionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(Bienvenida)
                                .addGap(50, 50, 50)
                                .addComponent(Escogencia_A)
                                .addGap(18, 18, 18)
                                .addComponent(ali, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(Escogencia_C)
                                .addGap(38, 38, 38)
                                .addGroup(panelPresentacionLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(elegir_grafo1)
                                        .addComponent(elegir_grafo2)
                                        .addComponent(elegir_grafo3))
                                .addGap(30, 30, 30)
                                .addComponent(Boton_validar)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(Historial)
                                .addGap(29, 29, 29)
                                .addComponent(Boton_registro_partidas)
                                .addGap(75, 75, 75))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelPresentacion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelPresentacion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void Boton_validarActionPerformed(java.awt.event.ActionEvent evt) {

        alimen = ali.getText();
        alimento = Integer.parseInt(alimen);

        if (elegir_grafo1.isSelected() == true) {
            if (alimento <= 5) {
                if (alimento > 0) {
                    Bienvenida.this.dispose();
                    modo_juego = "Juego 5";
                    new Juego5(alimento).setVisible(true);
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Para que el juego empiece, " +
                            "seleccione una aldea para colocar la comida");
                    //Comida obj = new Comida(modo_juego, alimento, "verde");
                    //Comida.main();
                } else {
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: La cantidad de comida debe ser mayor que 0");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ATENCIÓN: La cantidad de comida debe ser menor o igual a 5");
            }
        } else if (elegir_grafo2.isSelected() == true) {
            if (alimento <= 5) {
                if (alimento > 0) {
                    Bienvenida.this.dispose();
                    modo_juego = "Juego 7";
                    new Juego7(alimento).setVisible(true);
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Para que el juego empiece, " +
                            "seleccione una aldea para colocar la comida");
                    //Comida obj = new Comida(modo_juego, alimento, "verde");
                    //Comida.main();
                } else {
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: La cantidad de comida debe ser mayor que 0");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ATENCIÓN: La cantidad de comida debe ser menor o igual a 5");
            }
        } else if (elegir_grafo3.isSelected() == true) {
            if (alimento <= 5) {
                if (alimento > 0) {
                    Bienvenida.this.dispose();
                    modo_juego = "Juego 9";
                    new Juego9(alimento).setVisible(true);
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: Para que el juego empiece, " +
                            "seleccione una aldea para colocar la comida");
                    //Comida obj = new Comida(modo_juego, alimento, "verde");
                    //Comida.main();
                } else {
                    JOptionPane.showMessageDialog(null, "ATENCIÓN: La cantidad de comida debe ser mayor que 0");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ATENCIÓN: La cantidad de comida debe ser menor o igual a 5");
            }
        }
    }

    private void Boton_registro_partidasActionPerformed(java.awt.event.ActionEvent evt) {

        Bienvenida.this.dispose();
        new Historial().setVisible(true);
    }

    /**
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JLabel Bienvenida;
    private JButton Boton_registro_partidas;
    private JButton Boton_validar;
    private JLabel Escogencia_A;
    private JLabel Escogencia_C;
    private JLabel Historial;
    private JTextField ali;
    private ButtonGroup categorias;
    private JRadioButton elegir_grafo1;
    private JRadioButton elegir_grafo2;
    private JRadioButton elegir_grafo3;
    private JPanel panelPresentacion;
    // End of variables declaration
}