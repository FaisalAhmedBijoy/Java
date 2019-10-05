package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDemo extends JFrame {

    private Container c;
    private JPanel panel1, panel2;
    private JButton bt1,bt2,bt3;
    private JLabel label ;

    PanelDemo() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        this.setTitle("JPanel Demo");
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel1.setBounds(30, 50, 200, 300);
        c.add(panel1);
        panel2.setBounds(300, 50, 200, 300);
        c.add(panel2);
        label =new JLabel ("JPanel Demo ") ;
        label.setBounds(10, 10, 100, 30);
        c.add(label) ;
        bt1 =new JButton(" 1 ") ;
       // bt1.setBounds(, WIDTH, WIDTH, WIDTH);
        bt2 =new JButton(" 2 ") ;
        bt3=new JButton(" 3 ") ;
        
        panel1.add(bt1) ;
        panel2.add(bt2) ;
       panel1.add(bt3) ;
    }

    public static void main(String[] args) {
        PanelDemo frame = new PanelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 600, 500);

    }

}
