
package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextAreaDemo extends JFrame {
    
    private JScrollPane scroll ;
    private Container c;
    private JTextArea ta ;
    TextAreaDemo(){
        c=this.getContentPane() ;
        c.setLayout(null);
        
        c.setBackground(Color.yellow);
        this.setBounds(100, 50, 400, 300);
        ta =new JTextArea () ;
        //ta.setBounds(50, 50, 300, 200);
       // ta.setLineWrap(true);
       // ta.setWrapStyleWord(true);
        scroll =new JScrollPane(ta);
        scroll.setBounds(10, 50, 300, 200);
        c.add(ta) ;
        c.add(scroll) ;
    }
    
    public static void main(String[] args) {
       TextAreaDemo frame =new TextAreaDemo();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
