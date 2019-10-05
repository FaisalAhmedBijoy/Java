
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class ButtionAction extends JFrame {
    private  Container c ;
    private JTextField tf;
    private JButton bt ;
    
    
    ButtionAction ()
    {
        inicomponent() ;
    }
    public void inicomponent(){
        
        c=this.getContentPane() ;
        c.setLayout(null);
        c.setBackground(Color.yellow);
        tf=new JTextField() ;
        tf.setBounds(50, 20, 80, 30);
        bt=new JButton("Clear") ;
        bt.setBounds(50, 60, 80, 30);
        c.add(bt) ;
        c.add(tf);
        
        bt.addActionListener(new ActionListener (){
        
        public void actionPerformed (ActionEvent e)
        {
            tf.setText(" ");
            
        }
            
        } );
        
        
        
    }
    
    public static void main(String[] args) {
        
        
        ButtionAction frame =new  ButtionAction() ;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 100, 400, 250);
        frame.setTitle("JButton ActionListener Demo ");
    }
    
}
