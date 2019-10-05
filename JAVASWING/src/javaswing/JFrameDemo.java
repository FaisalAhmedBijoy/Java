package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDemo extends JFrame{

    private ImageIcon icon;
    private Container c ;
    private JLabel    userlabel ,passlabel;
    private Font f ;
    private JLabel imglabel ;
    private ImageIcon img ;
    
            
    JFrameDemo() {
        
        initcomponent();

    }

    public void initcomponent() {
        //icon = new ImageIcon(getClass().getResource("Image.jpg"));
      // this.setIconImage(icon.getImage());
        // this.setImageIcon(icon.getImage());
       f= new Font("Arial",Font.ITALIC ,15) ;
       c=this.getContentPane() ;
       c.setBackground(Color.GREEN);
       
       
       userlabel =new JLabel() ;
       userlabel.setText("Enter User Name : ");
       userlabel.setBounds(50, 20, 200, 50);
       c.add(userlabel) ;
       userlabel.setFont(f);
       userlabel.setForeground(Color.RED);
       userlabel.setOpaque(true);
       userlabel.setBackground(Color.yellow);
       userlabel.setToolTipText("Please , Enter User Name ");
       
     //  img =new ImageIcon(getClass().getResource("KUET.jpg")) ;
       //imglabel=new JLabel (img) ;
       imglabel.setBounds(50, 30,img.getIconWidth(), img.getIconHeight());
       //c.add(imglabel);
       
       String s1 =userlabel.getToolTipText() ;
        System.out.println("Username : "+s1);
      
       
       passlabel =new JLabel("Enter Your Passward") ;
       passlabel.setForeground(Color.BLUE);
       passlabel.setBounds(50,70, 200, 50);
       passlabel.setFont(f);
       passlabel.setToolTipText("Give Me your Passward");
       c.add(passlabel) ;
      String s2=passlabel.getToolTipText() ;
        System.out.println("Passward : "+ s2 );
       
    }

    public static void main(String[] args) {
        JFrameDemo frame = new JFrameDemo();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        // frame.setLocationRelativeTo(null);
        frame.setLocation(200, 50);

        // frame.setBounds(400, 300, 200, 200);
        frame.setTitle("Frame Demo ");
       // frame.setResizable(false);
      //  ImageIcon icon =new ImageIcon("Image.JPEG");
        //Container c =new Container() ;
        //c=getContentPane() ;
        //c.setBackground(Color.yellow);
//icon.setImage(icon.getImage());

    }

   

}
