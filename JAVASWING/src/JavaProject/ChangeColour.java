package JavaProject;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ChangeColour extends JFrame implements ChangeListener{

    private Container c;
    private JLabel redLabel, greenLabel, blueLabel, previewLabel;
    private JSlider redSlider, greenSlider, blueSlider;
    private JTextField redtf, greentf, bluetf;
    private JPanel panel;

    ChangeColour() {

        c = this.getContentPane();
        c.setLayout(null);
        // c.setBackground(Color.GREEN);

        redLabel = new JLabel("Red");
        greenLabel = new JLabel("Green");
        blueLabel = new JLabel("Blue");

        redLabel.setBounds(20, 30, 50, 30);
        c.add(redLabel);
        redSlider = new JSlider(0, 225, 0);
        redSlider.setBounds(80, 30, 200, 40);
        c.add(redSlider);

        redtf = new JTextField();
        redtf.setBounds(300, 30, 70, 40);
        c.add(redtf);

        //Grren 
        greenLabel.setBounds(20, 90, 50, 30);
        c.add(greenLabel);
        greenSlider = new JSlider(0, 225, 0);
        greenSlider.setBounds(80, 90, 200, 40);
        c.add(greenSlider);

        greentf = new JTextField();
        greentf.setBounds(300, 90, 70, 40);
        c.add(greentf);

        // Blue
        blueLabel.setBounds(20, 150, 50, 30);
        c.add(blueLabel);
        blueSlider = new JSlider(0, 225, 0);
        blueSlider.setBounds(80, 150, 200, 40);
        c.add(blueSlider);

        bluetf = new JTextField();
        bluetf.setBounds(300, 150, 70, 40);
        c.add(bluetf);

        previewLabel = new JLabel("Preview");
        panel = new JPanel();
        panel.setBackground(Color.yellow);
        panel.setBounds(400, 40, 200, 200);
        previewLabel.setBounds(450, 260, 80, 60);
        c.add(previewLabel);

        c.add(panel);
        redSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);

    }

      @Override
    public void stateChanged(ChangeEvent ce) {

        int redValue=redSlider.getValue() ;
        int greenValue =greenSlider.getValue();
        int blueValue=blueSlider.getValue();
        
        redtf.setText(" "+redValue);
        greentf.setText(" "+greenValue);
        bluetf.setText(" "+blueValue);
        
        Color color =new Color (redValue,greenValue,blueValue);
        
        panel.setBackground(color);
        
    
    }
    
    public static void main(String[] args) {
        ChangeColour frame = new ChangeColour();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 700, 450);

    }

  

}
