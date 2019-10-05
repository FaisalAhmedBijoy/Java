package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyListenerDemo extends JFrame {

    private Container c;
    private KeyListener kl;
    private JTextField tf ;
    private JTextArea ta ;

    KeyListenerDemo() {
        c=this.getContentPane() ;
        c.setBackground(Color.yellow);
        c.setLayout(null);
       // kl= new KeyListener()
        
        tf =new JTextField(" ") ;
        tf.setBounds(50, 50, 100, 60);
        tf.setBackground(Color.GREEN);
        c.add(tf);
        
        ta =new JTextArea () ;
        ta.setBounds(30, 120, 200, 300);
        ta.setBackground(Color.GREEN);
        c.add(ta) ;
        
        tf.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
               ta.append("Key Typed : "+ke.getKeyChar()+"\n");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
             ta.append("Key Pressed : "+ke.getKeyChar()+"\n");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
              ta.append("Key Realeased : "+ke.getKeyChar()+"\n");
            }
        } );
        
        
        
        

    }
    

    public static void main(String[] args) {

        KeyListenerDemo frame = new KeyListenerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 400, 500);

    }

}
