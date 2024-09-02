/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1.view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author RYZEN
 */
public class PanelCanva extends JPanel {
    private int x, y;

    
    public PanelCanva() {
        this.x=20;
        this.y=20;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
    g.setColor(Color.blue);
    g.fillOval(x, y, 50, 50);
    g.fillRect(50, 70, 25, 25);
    }
    
}
