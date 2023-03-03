package grouplayout;

import javax.swing.*;
import java.awt.*;

public class Grouplayout extends JFrame 
{
    public Grouplayout()
    {
        super("FlowLayout");
        this.setBounds(300, 320, 300, 200);
        
        initComponents();
        //this.pack();
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents()
    {
        GroupLayout layout = new GroupLayout(getContentPane());
        
        this.getContentPane().setLayout(layout);
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setHorizontalGroup(
        layout.createSequentialGroup()
            .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(
                layout.createParallelGroup().addComponent(button2)
                    .addComponent(button4)
            )
            .addComponent(button3)
            .addContainerGap(10, Short.MAX_VALUE)
            .addComponent(bAnuluj)
        );
        
        layout.setVerticalGroup(
            layout.createSequentialGroup()
            .addGroup(
                layout.createParallelGroup().addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button2).addComponent(button3)
            )
            .addComponent(button4)
            .addContainerGap(10, Short.MAX_VALUE)
            .addComponent(bAnuluj)
        );
        
        pack();
    }
    
    JButton button1 = new JButton("Button1");
    JButton button2 = new JButton("Button2");
    JButton button3 = new JButton("Button3");
    JButton button4 = new JButton("Button4");
    JButton bAnuluj = new JButton("Anuluj");

    public static void main(String[] args) {
        new Grouplayout().setVisible(true);
    }
    
}
