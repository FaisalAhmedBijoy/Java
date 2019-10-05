
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class JButtonDemo extends JFrame{
    private Container C ;
    private JButton bt1,bt2 ;
    private Font f ;
    private Cursor cursor ;
    private ImageIcon img1,img2 ;
    
    JButtonDemo()
    {
        iniComponent() ;
    }
    public void iniComponent(){
        C=this.getContentPane() ;
        C.setLayout(null);
      //  C.setBounds(50,20 , 50, 20);
        C.setBackground(Color.yellow);
        f=new Font ("Arial" ,Font.BOLD +Font.ITALIC ,15) ;
       cursor=new Cursor(Cursor.CROSSHAIR_CURSOR) ;
       img1 =new ImageIcon(getClass().getResource("Login.jpg")) ;
       img2 =new ImageIcon (getClass().getResource("Clear.jpg")) ;
       
       bt1 =new JButton(img1);
       bt2=new JButton (img2) ;
       // bt1 =new JButton("Name") ;
      // img1.getIconHeight() ;
       
        bt1.setBounds(50, 50, img1.getIconHeight() , img1.getIconWidth());
        C.add(bt1) ;
       // bt2=new JButton ("Roll");
        bt2.setBounds(600, 50, img2.getIconHeight(),img2.getIconWidth());
        bt1.setCursor(cursor);
        C.add(bt2) ;
        //C.add(f) ;
        bt1.setFont(f);
        bt2.setFont(f);
        bt1.setForeground(Color.MAGENTA);
        bt1.setBackground(Color.RED);
        bt1.setBackground(Color.PINK);
        C.setFont(f);
        
        
    }
    
    public static void main(String[] args) {
        
     JButtonDemo frame =new  JButtonDemo () ;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 100, 1000, 800);
        frame.setTitle("JButtonDemoDemo ");
    }
    
}
