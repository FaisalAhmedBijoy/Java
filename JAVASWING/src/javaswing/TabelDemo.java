package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TabelDemo extends JFrame {

    private Container c;
    private JTable table;
   private JScrollPane scroll ;
   private JLabel label;
    private String[] col = {"ID", "Name", "GPA"};
    private String[][] row = {
        {"101", "Anisal", "3.94"},
        {"102", "Fasial", "3.4"},
        {"103", "Ahmed", "3.9"},
        
         {"101", "Anisal", "3.94"},
        {"102", "Fasial", "3.4"},
        {"103", "Ahmed", "3.9"},
         {"101", "Anisal", "3.94"},
        {"102", "Fasial", "3.4"},
        {"103", "Ahmed", "3.9"},
        
        {"104", "Bijoy", "3.0"}
    };

    TabelDemo() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        label=new JLabel("Student Information") ;
        label.setBounds(40, 5, 200, 20);
        c.add(label);
        table =new JTable (row,col) ;
        scroll =new JScrollPane (table );
        scroll.setBounds(20, 50, 400, 400);
        c.add(scroll) ;
        table.setBackground(Color.PINK);
 //       table.setEnabled(false); // Edit
        table.setSelectionBackground(Color.RED);
        
    }

    public static void main(String[] args) {
        TabelDemo frame = new TabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 450);

    }

}
