
package JavaProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NewFrame extends JFrame{
    private Container c ;
   private JLabel label;
   private Font f ;
    NewFrame (){
        this.setBounds(500, 300, 400, 250);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c=this.getContentPane();
        c.setBackground(Color.yellow);
        label =new JLabel() ;
        label.setBounds(50, 50, 200,100 );
        label.setText("Fasial Ahmed Bijoy");
        f=new Font ("Arial",Font.BOLD +Font.ITALIC ,18) ;
        label.setFont(f);
        c.add(label);
    }
    public static void main(String[] args) {
        
        NewFrame frame=new NewFrame ();
        frame.setVisible(true);
    }
    
}
