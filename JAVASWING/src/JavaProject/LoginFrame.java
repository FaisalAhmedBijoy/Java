
package JavaProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginFrame extends JFrame{
    private Container c ;
    private JLabel username ,passward ;
    private JTextField name;
    private  JPasswordField pass ;
    private Font f ;
    private JButton login ,clear ;
    
    
    LoginFrame (){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 50, 400, 300);
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f= new Font ("Arial",Font.BOLD ,15) ;
        username = new JLabel() ;
        passward =new JLabel () ;
        
        username.setBounds(50, 50, 100, 30);
        username.setText("User Name : ");
        username.setFont(f);
        username.setForeground(Color.BLUE);
        c.add(username);
        name=new JTextField();
        name.setBounds(150, 50,120 , 30);
        name.setBackground(Color.GREEN);
        name.setFont(f);
        c.add(name) ;
        
        
        passward.setText("Passward : ");
        passward.setBounds(50, 120, 100, 30);
        passward.setForeground(Color.BLUE);
        passward.setFont(f);
        c.add(passward) ;
        pass=new JPasswordField() ;
        pass.setBounds(150, 120, 120, 30);
        pass.setBackground(Color.GREEN);
        pass.setEchoChar('*');
        
        pass.setFont(f);
        c.add(pass);
        
        // Login & Clear JButtion
        login =new JButton ("Login") ;
        login.setBounds(70, 180, 80, 40);
        login.setFont(f);
        login.setBackground(Color.yellow);
        c.add(login) ;
        clear =new JButton ("Clear") ;
        clear.setBounds(180, 180, 80, 40);
        clear.setFont(f);
        clear.setBackground(Color.yellow);
        c.add(clear);
        
        clear.addActionListener(new ActionListener  () {
       
            public void actionPerformed (ActionEvent e){
             name.setText("");
             pass.setText("");
            }
        
        });
        login.addActionListener(new ActionListener () {

         
            public void actionPerformed(ActionEvent e) {
                String NAME=name.getText();
                String PASS =pass.getText();
                if ((NAME.equals("Faisal"))&&PASS.equals("01623155000"))
                {
                    JOptionPane.showMessageDialog(null,"Successfully Login ");
                    
                    NewFrame frame =new NewFrame() ;
                   // dispose ();
                    frame.setVisible(true);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Wrong Usename or Passward");
                }
                
            }
        
        
        });
        
        
    }
    
    public static void main(String[] args) {
        
        LoginFrame frame=new LoginFrame() ;
        frame.setVisible(true);
        frame.setTitle("Login");
        
    }
    
    
}
