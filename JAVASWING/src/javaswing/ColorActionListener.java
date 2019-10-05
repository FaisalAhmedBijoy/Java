package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorActionListener extends JFrame implements ActionListener {

    private Container c;
    private JButton greenButton, redButton, blueButton;

    ColorActionListener() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        greenButton = new JButton("GREEN");
        redButton = new JButton("RED");
        blueButton = new JButton("BLUE");
        greenButton.setBounds(50, 50, 80, 50);
        greenButton.setForeground(Color.GREEN);
        c.add(greenButton);
        redButton.setForeground(Color.RED);
        redButton.setBounds(50, 120, 80, 50);
        c.add(redButton);
        blueButton.setForeground(Color.BLUE);
        blueButton.setBounds(50, 190, 80, 50);
        c.add(blueButton);
        //Individual ActioListener 
        /*
         blueButton.addActionListener(new ActionListener (){

         @Override
         public void actionPerformed(ActionEvent e) {
                
         c.setBackground(Color.BLUE);
                
         }
        
        
        
         });
        
         redButton.addActionListener(new ActionListener (){

         @Override
         public void actionPerformed(ActionEvent e) {
                
         c.setBackground(Color.RED);
                
         }
        
        
        
         });
         
         greenButton.addActionListener(new ActionListener (){

         @Override
         public void actionPerformed(ActionEvent e) {
                
         c.setBackground(Color.GREEN);
                
         }
        
        
        
         });
         */

        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        redButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == greenButton) {
            c.setBackground(Color.GREEN);
        } else if (e.getSource() == blueButton) {
            c.setBackground(Color.BLUE);
        } else if (e.getSource() == redButton) {
            c.setBackground(Color.RED);
        }
    }

    public static void main(String[] args) {

        ColorActionListener frame = new ColorActionListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 400, 500);

    }

}
