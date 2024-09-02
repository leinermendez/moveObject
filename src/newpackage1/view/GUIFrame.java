/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author RYZEN
 */
public class GUIFrame extends JFrame {

    private JButton btnMove;
    //private JPanel canva;
    private PanelCanva panelCanva;
    
    public GUIFrame(int width, int height) {
        
        this.setSize(width, height);
        this.setVisible(true);
    }
    
    public GUIFrame(){
        this.btnMove= new JButton("move Object");
        this.panelCanva= new PanelCanva();
        this.add(this.panelCanva, BorderLayout.CENTER);
//        this.canva = new JPanel();
//        this.canva.setBackground(Color.red);
//        this.add(this.canva, BorderLayout.CENTER);
        this.add(this.btnMove, BorderLayout.SOUTH);
        
        
    this.setSize(400, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    }
    
}
