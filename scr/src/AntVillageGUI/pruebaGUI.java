package AntVillageGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pruebaGUI extends JPanel implements ActionListener {
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
    pruebaGUI(){
        this.setPreferredSize(new Dimension(ancho,alto));
        this.setBackground(Color.black);
        enemy = new ImageIcon("imagenes\\hormiga verde.png").getImage();
        enemy2 = new ImageIcon("imagenes\\hormiga azul.png").getImage();
        timer = new Timer(10 , this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D G2D = (Graphics2D) g;
        G2D.drawImage(enemy , x ,y , null);
        G2D.drawImage(enemy2 , x2 ,y2 , null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >ancho-enemy.getWidth(null)){
            xVelocity = xVelocity * -1;
        }
        x= x+xVelocity;
        //y2 =y2+yVelocity;
        repaint();
    }
}


