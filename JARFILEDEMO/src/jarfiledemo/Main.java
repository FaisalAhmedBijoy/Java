
package jarfiledemo;

import javax.swing.JFrame;


public class Main {
    
     public static void main(String[] args) {
        MultiplicationTable frame = new MultiplicationTable();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 900, 600);
        frame.setTitle("Multiplication Table ");

    }
    
}
