package javaswing;

import JavaProject.ChangeColour;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpinnerDemo extends JFrame implements ChangeListener {

    private Container c;
    private JSpinner spinner;
    private SpinnerNumberModel value;
    private JLabel label;

    SpinnerDemo() {
        c = this.getContentPane();
        c.setLayout(null);

    //       value= new  SpinnerNumberModel(10,0,30,1);
        spinner = new JSpinner();
        spinner.setBounds(100, 100, 70, 50);
        c.add(spinner);

        label = new JLabel();
        label.setBounds(200, 150, 50, 50);
        label.setBackground(Color.yellow);
        spinner.addChangeListener(this);
        c.add(label);
    }

    @Override
    public void stateChanged(ChangeEvent ce) {

        String number = spinner.getValue().toString();
        int value = Integer.parseInt(number);
        label.setText("Value : " +value);

    }

    public static void main(String[] args) {
        SpinnerDemo frame = new SpinnerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 700, 450);

    }

}
