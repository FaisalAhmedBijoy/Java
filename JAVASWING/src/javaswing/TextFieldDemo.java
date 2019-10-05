package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextFieldDemo extends JFrame {

    private Container c;
    private JTextField t1, t2;
    private JLabel s1, s2;
    String name, mobile;
    private Font f;

    TextFieldDemo() {
        IniComponent();
    }

    public void IniComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial", Font.ITALIC + Font.BOLD, 20);

        t1 = new JTextField();
        s1 = new JLabel();
        t1.setBounds(50, 50, 200, 50);
        s1.setText("Enter Your Name ");
        s1.setBounds(50, 10, 200, 50);
        t1.setToolTipText("Enter Your Name ");
        s1.setToolTipText("Enter Your Name : ");
        t1.setHorizontalAlignment(JTextField.CENTER);
     //   name = t1.getToolTipText();
           // t2.setOpaque(true) ;
        name=t1.getName();
        System.out.println("Name : " + name);
        t1.setForeground(Color.BLUE);

        t1.setFont(f);
        t1.setBackground(Color.ORANGE);
       // c.add(t1);
        //c.add(s1);
     
        
        c.add(t1);
        c.add(s1);

        t2 = new JTextField();
        s2 = new JLabel();
        s2.setText("Enter Mobile Number ");
        s2.setBounds(50, 120, 200, 50);
        t2.setBounds(50, 160, 200, 50);
        t2.setForeground(Color.ORANGE);
        t2.setToolTipText("Enter Mobile Number ");
        mobile = t2.getToolTipText();
        System.out.println("Mobile : " + mobile);
        t2.setFont(f);
        t2.setHorizontalAlignment(JTextField.RIGHT);
        t2.setBackground(Color.yellow);

        c.add(t2);
        c.add(s2);

    }

    public static void main(String[] args) {
        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(50, 30, 400, 300);
        frame.setTitle("Frame Application");

    }

}
