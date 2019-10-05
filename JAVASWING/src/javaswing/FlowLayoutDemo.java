package javaswing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {

    private Container c;
    //private FlowLayout fLayout ;
    private BoxLayout box;
    private JButton buttons[];
    private GridLayout gl;

    FlowLayoutDemo() {
        c = this.getContentPane();
    //  box =new BoxLayout (c,BoxLayout.Y_AXIS) ;

        //fLayout =new FlowLayout (FlowLayout.LEFT);
        //  c.setLayout(fLayout) ;
        //  c.setLayout(box);
        gl = new GridLayout(3,3);
        gl.setHgap(10);
        gl.setVgap(10);
        c.setLayout(gl);
        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton(" " + (i + 1));
            // c.add(Box.createVerticalBox(10)) ;
            c.add(buttons[i]);
        }
    }

    public static void main(String[] args) {
        FlowLayoutDemo frame = new FlowLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 400, 450);

    }

}
