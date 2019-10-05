
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class RadioButtionDemo extends JFrame{
    private Container c;
    private JRadioButton male ,female,other ;
    private ButtonGroup group;
    private Font f ;
    private JTextArea ta ;
    
    RadioButtionDemo ()
    {
        c=this.getContentPane() ;
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        male =new JRadioButton("Male") ;
        male.setBounds(50, 50, 70, 50);
        c.add(male) ;
        
        female =new JRadioButton ("Female") ;
        female.setBounds(180, 50, 100, 50);
        c.add(female) ;
        group=new ButtonGroup () ;
        group.add(male);
        group.add(female);
        
        other =new JRadioButton("other") ;
        other.setBounds(50, 120, 100, 50);
        c.add(other) ;
        group.add(other);
        //c.add(group);
       // c.add(group) ;
        f= new Font ("Arial",Font.BOLD,18) ;
        male.setFont(f);
        female.setFont(f);
        other.setFont(f);
        male.setBackground(Color.GREEN);
        female.setBackground(Color.GREEN);
        other.setBackground(Color.GREEN);
        male.setForeground(Color.RED);
        
        ta =new JTextArea ();
        ta.setBounds(60, 180,200, 150);
        c.add(ta);
        
        
    }
    
    
    public static void main(String[] args) {
        
        RadioButtionDemo frame= new RadioButtionDemo () ;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 400, 500);
    }
    
}
