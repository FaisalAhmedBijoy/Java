package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxDemo extends JFrame {

    private Container c;
    private JComboBox cb;
    String[] proLanguage = {"C", "C++", "PHP", "JAVA", "Python", "Ruby"};
    private JLabel name;
    private JButton bt;
    

    ComboBoxDemo() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        cb = new JComboBox(proLanguage);
        cb.setBounds(50, 50, 80, 50);
        cb.setEditable(true);
        c.add(cb);
        cb.setSelectedIndex(3);
        cb.addItem("Fortran");
//proLanguage.addItem("FORTRAN") ;
        System.out.println("Item Count : " + cb.getItemCount());
        cb.removeItemAt(2);
        name =new JLabel (" ") ;
        name.setBounds(200, 50,200 , 40);
        bt =new JButton("Select");
        bt.setBounds(200, 100, 70, 60);
        c.add(bt);
        bt.addActionListener(new ActionListener (){
  
         
            @Override
            public void actionPerformed(ActionEvent ae) {
                name.setText("You Choose : "+cb.getSelectedItem().toString());
                
                
            }
        
        
        });
        c.add(name) ;
    }

    public static void main(String[] args) {
        
        ComboBoxDemo frame = new ComboBoxDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 400, 500);
    }
    
}
