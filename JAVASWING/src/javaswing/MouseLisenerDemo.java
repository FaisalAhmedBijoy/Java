
package javaswing;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseLisenerDemo extends JFrame{
    
    private Container c ;
    private JTextField tf ;
    private JTextArea ta  ;
    private JScrollPane scroll;
    private JButton btn;
    MouseLisenerDemo (){
        
        c=this.getContentPane() ;
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        tf=new JTextField() ;
        tf.setBounds(50, 40, 200, 60);
        c.add(tf) ;
        tf.setBackground(Color.GREEN);
        
        ta =new JTextArea () ;
       // ta.setBounds(60, 150, 200, 250);
       // c.add(ta) ;
        //ta.setBackground(Color.PINK);
        scroll =new JScrollPane(ta) ;
        scroll.setBounds(60, 150, 200, 250);
        c.add(scroll) ;
        
        btn =new JButton("Button");
        btn.setBounds(300, 50, 100, 60);
        btn.addFocusListener(new FocusListener (){

            @Override
            public void focusGained(FocusEvent fe) {
           ta.append("Button Focus gained \n");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                ta.append("Button Focus Lost\n") ;
            }
        });
        c.add(btn) ;
        
        this.addWindowListener(new WindowListener(){

            @Override
            public void windowOpened(WindowEvent we) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent we) {
             System.out.println("Window Closeing ");
            }

            @Override
            public void windowClosed(WindowEvent we) {
                 System.out.println("Window closed ");
            }

            @Override
            public void windowIconified(WindowEvent we) {
             System.out.println("Window Iconified ");
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
             System.out.println("Window Deiconified ");
            }

            @Override
            public void windowActivated(WindowEvent we) {
             System.out.println("Window Activated ");
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
             System.out.println("Window Deactivated ");
            }
 });
        ta.addMouseMotionListener(new MouseMotionListener(){

            @Override
            public void mouseDragged(MouseEvent me) {
            tf.setText("Mouse Dragged : "+me.getX()+" , "+me.getY()+"\n");
             //   tf.("Mouse Dragged : "+me.getX()+" , "+me.getY()+"\n");
            
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                 tf.setText("Mouse Moved : "+me.getX()+" , "+me.getY()+"\n");
            }
        });
        
        
        tf.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
             ta.append("Mouse click \n");
             
            }

            @Override
            public void mousePressed(MouseEvent me) {
                 ta.append("Mouse Pressed \n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
             ta.append("Mouse Realeased \n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
             ta.append("Mouse Entered \n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
             ta.append("Mouse Excited \n");
            }
 });
        
    }
    
    
      public static void main(String[] args) {
        MouseLisenerDemo frame = new MouseLisenerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 600, 500);

    }
    
}
