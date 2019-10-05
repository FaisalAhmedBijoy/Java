
package javaswing;

import javax.swing.JOptionPane ;
public class InputDialog {
    //JOptionPane.showInputDialog("Enter Your Name ") ;
    public static void main(String[] args) {
      //String name =  JOptionPane.showInputDialog("Enter Your Name") ;
      //JOptionPane.showMessageDialog(null, name+ " Welcome to Swing" );
        
        String f_name=JOptionPane.showInputDialog(null, "Enter Your First Name ","Login ",2);
        String l_name= JOptionPane.showInputDialog("Enter Your Last Name ");
        String name =f_name+" "+l_name ;
        
        String mobile= JOptionPane.showInputDialog("Enter Your Mobile Number ") ;
        JOptionPane.showMessageDialog(null, "Your Full Name "+name);
        JOptionPane.showMessageDialog(null,"MOBILE : "+mobile);
        
    }
    
}
