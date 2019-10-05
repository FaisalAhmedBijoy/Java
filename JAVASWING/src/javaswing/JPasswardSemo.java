
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField ;




public class JPasswardSemo extends JFrame {

 private Container c ;
 private JPasswordField pf ;
 private Font f;
JPasswardSemo ()
{
    iniComponent() ;
}
public void iniComponent(){
    c=this.getContentPane() ;
    c.setLayout(null); 
    c.setBackground(Color.GREEN);
    pf=new JPasswordField() ;
    pf.setBounds(50, 20, 200, 40);
    pf.setForeground(Color.RED);
    pf.setEchoChar('*');
    pf.setBackground(Color.yellow);
    f= new Font("Arial",Font.BOLD ,18) ;
    pf.setFont(f);
    c.add(pf) ;
    
    
    
    
}    
    
    public static void main(String[] args) {
        
        JPasswardSemo frame =new  JPasswardSemo () ;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 100, 400, 250);
        frame.setTitle("JFrame Passward Demo ");
     
        
    }
    
}
