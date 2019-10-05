package javaswing;


import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneDemo extends JFrame {

    private Container c;
    private JTabbedPane tp;
    private JPanel panel1, panel2, panel3;
    private JLabel label1,label2,label3;
    

    TabbedPaneDemo() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);

        tp= new JTabbedPane ();
        tp.setBounds(50, 50, 200, 200);
        tp.setBackground(Color.GREEN);
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        tp.addTab("Home", panel1);
        tp.addTab("Help", panel2);
        tp.addTab("Exit", panel3);
        label1 =new JLabel("Home Select ");
        label2 =new JLabel("Help Select ");
        label3=new JLabel("Exit Select ");
        panel1.add(label1);
        panel2.add(label2) ;
        panel3.add(label3);
        c.add(tp);
    }

    public static void main(String[] args) {
        TabbedPaneDemo frame = new TabbedPaneDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 700, 450);

    }

}
