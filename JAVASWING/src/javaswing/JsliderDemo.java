
package javaswing;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;


public class JsliderDemo extends JFrame{
    private Container c;
    private JSlider slider;
    JsliderDemo  (){
        c=this.getContentPane() ;
        
        c.setLayout(null);
        slider =new JSlider (0,20,15);
        slider.setBounds(100, 50,300 , 50);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        c.add(slider);
        
        
        
        
    }
    
     public static void main(String[] args) {
       JsliderDemo  frame = new JsliderDemo ();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 700, 450);

    }
    
}
