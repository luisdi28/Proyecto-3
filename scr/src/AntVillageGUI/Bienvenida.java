package AntVillageGUI;

import AntNFood.Comida;

import javax.swing.JOptionPane;

public class Bienvenida extends javax.swing.JFrame {

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

        categorias = new javax.swing.ButtonGroup();
        panelPresentacion = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        Escogencia_A = new javax.swing.JLabel();
        ali = new javax.swing.JTextField();
        Escogencia_C = new javax.swing.JLabel();
        Boton_validar = new javax.swing.JButton();
        elegir_grafo3 = new javax.swing.JRadioButton();
        elegir_grafo1 = new javax.swing.JRadioButton();
        elegir_grafo2 = new javax.swing.JRadioButton();
        Boton_registro_partidas = new javax.swing.JButton();
        Historial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        javax.swing.GroupLayout panelPresentacionLayout = new javax.swing.GroupLayout(panelPresentacion);
        panelPresentacion.setLayout(panelPresentacionLayout);
        panelPresentacionLayout.setHorizontalGroup(
                panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                .addGroup(panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(elegir_grafo1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(elegir_grafo2)
                                                .addGap(80, 80, 80)
                                                .addComponent(elegir_grafo3))
                                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                                .addGroup(panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                                                .addGap(234, 234, 234)
                                                                .addComponent(Bienvenida))
                                                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(Escogencia_A)))
                                                .addGap(0, 4, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                                .addComponent(Historial)
                                                .addGap(23, 23, 23))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                                .addComponent(Boton_registro_partidas)
                                                .addGap(235, 235, 235))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                                .addComponent(ali, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(304, 304, 304))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                                .addComponent(Escogencia_C)
                                                .addGap(191, 191, 191))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPresentacionLayout.createSequentialGroup()
                                                .addComponent(Boton_validar)
                                                .addGap(289, 289, 289))))
        );
        panelPresentacionLayout.setVerticalGroup(
                panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPresentacionLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(Bienvenida)
                                .addGap(50, 50, 50)
                                .addComponent(Escogencia_A)
                                .addGap(18, 18, 18)
                                .addComponent(ali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(Escogencia_C)
                                .addGap(38, 38, 38)
                                .addGroup(panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(elegir_grafo1)
                                        .addComponent(elegir_grafo2)
                                        .addComponent(elegir_grafo3))
                                .addGap(30, 30, 30)
                                .addComponent(Boton_validar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(Historial)
                                .addGap(29, 29, 29)
                                .addComponent(Boton_registro_partidas)
                                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void Boton_validarActionPerformed(java.awt.event.ActionEvent evt) {

        alimen = ali.getText();
        alimento = Integer.parseInt(alimen);

        if (elegir_grafo1.isSelected() == true) {
            if (alimento <= 5){
                Bienvenida.this.dispose();
                modo_juego = "Juego 5";
                new Juego5(alimento).setVisible(true);
                //Comida obj = new Comida(modo_juego, alimento, "verde");
                //Comida.main();
            }
            else{
                JOptionPane.showMessageDialog(null, "ATENCIÓN: La cantidad de comida debe ser menor o igual a 5");
            }
        }
        else if (elegir_grafo2.isSelected() == true){
            if (alimento <= 5){
                Bienvenida.this.dispose();
                modo_juego = "Juego 7";
                new Juego7(alimento).setVisible(true);
                //Comida obj = new Comida(modo_juego, alimento, "verde");
                //Comida.main();
            }
            else{
                JOptionPane.showMessageDialog(null, "ATENCIÓN: La cantidad de comida debe ser menor o igual a 5");
            }
        }
        else if (elegir_grafo3.isSelected() == true){
            if (alimento <= 5){
                Bienvenida.this.dispose();
                modo_juego = "Juego 9";
                new Juego9(alimento).setVisible(true);
                //Comida obj = new Comida(modo_juego, alimento, "verde");
                //Comida.main();
            }
            else{
                JOptionPane.showMessageDialog(null, "ATENCIÓN: La cantidad de comida debe ser menor o igual a 5");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "ATENCIÓN: Debe seleccionar una categoría de juego");
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
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
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton Boton_registro_partidas;
    private javax.swing.JButton Boton_validar;
    private javax.swing.JLabel Escogencia_A;
    private javax.swing.JLabel Escogencia_C;
    private javax.swing.JLabel Historial;
    private javax.swing.JTextField ali;
    private javax.swing.ButtonGroup categorias;
    private javax.swing.JRadioButton elegir_grafo1;
    private javax.swing.JRadioButton elegir_grafo2;
    private javax.swing.JRadioButton elegir_grafo3;
    private javax.swing.JPanel panelPresentacion;
    // End of variables declaration
}