package javaswing;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon ;
public class JAVASWING {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Wrong Passward","Messege",JOptionPane.ERROR_MESSAGE);
       // JOptionPane.showMessageDialog(null, "Wrong Passward", "Warning", 2);
//   JOptionPane.showMessageDialog(null, "Wrong Passward");
        ImageIcon img =new ImageIcon("KUET.jpg") ;
        JOptionPane.showMessageDialog(null,"Wrong Passward","Warning",JOptionPane.ERROR_MESSAGE ,img);
    }

}
