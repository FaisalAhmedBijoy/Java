package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionListenDemo extends JFrame {

    private Container c;
    private JTextField t1, t2;

    ActionListenDemo() {
        IniComponent();

    }

    public void IniComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        t1 = new JTextField();
        t1.setBounds(50, 30, 200, 50);
        
        t1.setForeground(Color.BLUE);
        t1.setBackground(Color.ORANGE);

        c.add(t1);
        c.add(t2);

        Handler handler = new Handler();
        t1.addActionListener(handler);
        t2.addActionListener(handler);
        //t1.addActionListener(new ActionListener() {
        /*    
         t1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         String s = t1.getText();
         if (s.isEmpty()) {
         System.out.println("You Enter Nothing");
         } else {
         JOptionPane.showMessageDialog(null, "t1 : " + s);
         System.out.println("JText : "+s);
         }
         }
         }
         );
         t2=new JTextField() ;
         t2.setBounds(50, 80, 200, 50);
         t2.setForeground(Color.BLUE);
         t2.setBackground(Color.ORANGE);

         t2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         String s = t2.getText();
         if (s.isEmpty()) {
         System.out.println("You Enter Nothing");
         } else {
         JOptionPane.showMessageDialog(null, "t2 : " + s);
         System.out.println("JTextField : "+s);
         }

         }
         }
         );
         c.add(t2) ;
         */
       // c.add (t1) ;
        //c.add(t2) ;

    }

   class Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            
        
           if (e.getSource() == t1) {
               String s =t1.getText() ;
               if (s.isEmpty()){
                   System.out.println("You Enter Noting : ");
               }
               else{
                   System.out.println("T1 : "+s);
                   JOptionPane.showMessageDialog(null,"T1 : "+t1);
               }
               
           }
           else
           {
                String s =t2.getText() ;
               if (s.isEmpty()){
                   System.out.println("You Enter Noting : ");
               }
               else{
                   System.out.println("T2 : "+s);
                   JOptionPane.showMessageDialog(null,"T2 : "+t2);
               }
               
           }

        }
    }

        public static void main(String[] args) {
            ActionListenDemo frame = new ActionListenDemo();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Action Listen Application ");
            frame.setBounds(50, 20, 400, 300);

        }

    }
