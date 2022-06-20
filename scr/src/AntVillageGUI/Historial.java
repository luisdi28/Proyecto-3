package AntVillageGUI;

import XML.FileReader;
import Lists.circularList;

public class Historial extends javax.swing.JFrame {

    private FileReader fileReader;
    private circularList circularlist;
    private String name;
    private int n;

    /**
     * Creates new form Historial
     */
    public Historial() {

        initComponents();

        fileReader = new FileReader();
        fileReader.readFolder();

        circularlist = fileReader.getCircularlist();

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        panelHistorial = new javax.swing.JPanel();
        Historial = new javax.swing.JLabel();
        Partida = new javax.swing.JLabel();
        Comida_verdes = new javax.swing.JLabel();
        Comida_azules = new javax.swing.JLabel();
        bton_siguiente = new javax.swing.JButton();
        bton_Volver = new javax.swing.JButton();
        número_Partida = new javax.swing.JLabel();
        alimento_verde = new javax.swing.JLabel();
        alimento_azul = new javax.swing.JLabel();
        bton_Elinar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelHistorial.setBackground(new java.awt.Color(0, 153, 153));

        Historial.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Historial.setText("Historial de partidas");

        Partida.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Partida.setText("Partida:");

        Comida_verdes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Comida_verdes.setText("Cantidad de comida recolectada por las hormigas verdes:");

        Comida_azules.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Comida_azules.setText("Cantidad de comida recolectada por las hormigas azules:");

        bton_siguiente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bton_siguiente.setText("Siguiente");
        bton_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_siguienteActionPerformed(evt);
            }
        });

        bton_Volver.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bton_Volver.setText("Volver");
        bton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_VolverActionPerformed(evt);
            }
        });

        número_Partida.setBackground(new java.awt.Color(102, 102, 102));
        número_Partida.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        número_Partida.setText("...........");

        alimento_verde.setBackground(new java.awt.Color(102, 102, 102));
        alimento_verde.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        alimento_verde.setText("...........");

        alimento_azul.setBackground(new java.awt.Color(102, 102, 102));
        alimento_azul.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        alimento_azul.setText("...........");

        bton_Elinar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bton_Elinar.setText("Eliminar");
        bton_Elinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_ElinarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHistorialLayout = new javax.swing.GroupLayout(panelHistorial);
        panelHistorial.setLayout(panelHistorialLayout);
        panelHistorialLayout.setHorizontalGroup(
                panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelHistorialLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelHistorialLayout.createSequentialGroup()
                                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelHistorialLayout.createSequentialGroup()
                                                                .addComponent(Partida)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(número_Partida))
                                                        .addGroup(panelHistorialLayout.createSequentialGroup()
                                                                .addComponent(Comida_verdes)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                                                .addComponent(alimento_verde))
                                                        .addGroup(panelHistorialLayout.createSequentialGroup()
                                                                .addComponent(Comida_azules)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(alimento_azul)))
                                                .addContainerGap())
                                        .addGroup(panelHistorialLayout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(bton_siguiente)
                                                .addGap(80, 80, 80)
                                                .addComponent(bton_Volver)
                                                .addGap(71, 71, 71)
                                                .addComponent(bton_Elinar)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistorialLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Historial)
                                .addGap(218, 218, 218))
        );
        panelHistorialLayout.setVerticalGroup(
                panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelHistorialLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Historial)
                                .addGap(128, 128, 128)
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Partida)
                                        .addComponent(número_Partida))
                                .addGap(91, 91, 91)
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Comida_verdes)
                                        .addComponent(alimento_verde))
                                .addGap(90, 90, 90)
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Comida_azules)
                                        .addComponent(alimento_azul))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bton_siguiente)
                                        .addComponent(bton_Volver)
                                        .addComponent(bton_Elinar))
                                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    public int getn() {
        return n;
    }

    public void minus_n() {
        n--;
    }

    public void plus_n() {
        n++;
    }

    private void bton_siguienteActionPerformed(java.awt.event.ActionEvent evt) {
        plus_n();
    }

    private void bton_VolverActionPerformed(java.awt.event.ActionEvent evt) {
        Historial.this.dispose();
        new Bienvenida().setVisible(true);
    }

    private void bton_ElinarActionPerformed(java.awt.event.ActionEvent evt) {
        circularlist.delete(name);
        minus_n();
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
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Comida_azules;
    private javax.swing.JLabel Comida_verdes;
    private javax.swing.JLabel Historial;
    private javax.swing.JLabel Partida;
    private javax.swing.JLabel alimento_azul;
    private javax.swing.JLabel alimento_verde;
    private javax.swing.JButton bton_Elinar;
    private javax.swing.JButton bton_Volver;
    private javax.swing.JButton bton_siguiente;
    private javax.swing.JLabel número_Partida;
    private javax.swing.JPanel panelHistorial;
    // End of variables declaration
}
