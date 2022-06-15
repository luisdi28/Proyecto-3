package AntVillageGUI;

import javax.swing.*;

public class pruebaFrame extends JFrame {
    pruebaGUI panel;
    pruebaFrame(){
        panel = new pruebaGUI();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
