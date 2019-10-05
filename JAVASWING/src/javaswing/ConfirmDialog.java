package javaswing;
import javax.swing.JOptionPane ;

public class ConfirmDialog {
    public static void main(String[] args) {
        //JOptionPane.showConfirmDialog(null, "Do You Want To Quit ",JOptionPane.YES_NO_CANCEL_OPTION);
       // JOptionPane.showConfirmDialog(null, "Do You want to Quit","EXIT",JOptionPane.YES_NO_OPTION) ;
        int choice = JOptionPane.showConfirmDialog(null,"Do You Want to Exit is Program ? ", "EXIT",JOptionPane.YES_NO_CANCEL_OPTION) ;
        if (choice == JOptionPane.YES_OPTION){
            System.out.println("EXIT PROGRAM");
            JOptionPane.showMessageDialog(null,"EXIT The Program");
            System.exit(0);
        }
        else if (choice == JOptionPane.NO_OPTION){
            
            System.out.println("You Choice No OPtion ! ");
            JOptionPane.showMessageDialog(null, "YOU CHOOSE NO OPTION ");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "YOU CHOOSE CANCEL");
            System.out.println("You Choose Cancel Option");
        }
    }
    
}
