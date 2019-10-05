package javaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JBoarderLayoutDemo extends JFrame {

    private Container c;
    private BorderLayout bLayout;
    private JButton bt1, bt2, bt3, bt4, bt5;

    JBoarderLayoutDemo() {

        c = this.getContentPane();
        c.setBackground(Color.yellow);
        bLayout =new BorderLayout() ;
        c.setLayout(bLayout);
        bLayout.setHgap(10);
        bLayout.setVgap(10);
        
 

        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        c.add(bt1, BorderLayout.NORTH);
        c.add(bt2, BorderLayout.EAST);
        c.add(bt3, BorderLayout.CENTER);
        c.add(bt4, BorderLayout.WEST);
        c.add(bt5, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        JBoarderLayoutDemo frame = new JBoarderLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 400, 450);

    }

}
