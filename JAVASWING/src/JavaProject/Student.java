package JavaProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Student extends JFrame {

    private Container c;
    private JLabel firstNameLabel ,lastNameLabel,phoneLabel,GpaLabel,info ;
    private JTextField firstNameText, lastNameText,phoneText,GpaText;
    private JButton addButton ,updateButton,deleteButton,clearButton ;
    private Font f ;
    
    Student() {
        
        //frame creation
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 50, 600, 600);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        //Font
        f = new Font("Arial", Font.ITALIC + Font.BOLD, 15);
        
      //Label 
        info =new JLabel("Student Registration ");
        info.setBounds(60,20 ,150, 30);
        info.setFont(f);
        c.add(info) ;
        
        firstNameLabel =new JLabel ("First Name : ");
        firstNameLabel.setBackground(Color.GREEN);
        firstNameLabel.setBounds(20, 60, 100, 30);
        firstNameLabel.setFont(f);
        c.add(firstNameLabel) ;
        
        firstNameText =new JTextField() ;
        firstNameText.setBounds(120,60 , 120, 30);
        
        firstNameText.setFont(f);
        c.add(firstNameText);
        
        addButton =new JButton ("Add");
        addButton.setBounds(300, 55, 100, 50);
        c.add(addButton);
        ////
          lastNameLabel =new JLabel ("Last Name : ");
        lastNameLabel.setBackground(Color.GREEN);
        lastNameLabel.setBounds(20, 110, 100, 30);
        lastNameLabel.setFont(f);
        c.add(lastNameLabel) ;
        
        lastNameText =new JTextField() ;
        lastNameText.setBounds(120,110 , 120, 30);
        
        lastNameText.setFont(f);
        c.add(lastNameText);
        
        addButton =new JButton ("Update");
        addButton.setBounds(300, 110, 100, 50);
        c.add(addButton);
        ////
         phoneLabel =new JLabel ("Phone : ");
        phoneLabel.setBackground(Color.GREEN);
        phoneLabel.setBounds(20, 170, 100, 30);
        phoneLabel.setFont(f);
        c.add(phoneLabel) ;
        
        phoneText =new JTextField() ;
        phoneText.setBounds(120,170 , 120, 30);
        
        phoneText.setFont(f);
        c.add(phoneText);
        
        deleteButton =new JButton ("Add");
        deleteButton.setBounds(300, 170, 100, 50);
        c.add(deleteButton);
        ////
         GpaLabel =new JLabel ("GPA : ");
        GpaLabel.setBackground(Color.GREEN);
        GpaLabel.setBounds(20, 220, 100, 30);
        GpaLabel.setFont(f);
        c.add(GpaLabel) ;
        
        GpaText =new JTextField() ;
        GpaText.setBounds(120,220 , 120, 30);
        
        GpaText.setFont(f);
        c.add(GpaText);
        
        clearButton =new JButton ("Clear");
        clearButton.setBounds(300, 235, 100, 40);
        c.add(clearButton);
        //
        
        
        
        

    }

    public static void main(String[] args) {

        Student frame = new Student();
        frame.setVisible(true);

    }

}
