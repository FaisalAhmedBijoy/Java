package JavaProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiplicationTable extends JFrame {

    private Container c;
    private ImageIcon img;
    private JLabel imgLabel, textLabel;
    private JTextField text;
    private JButton clearButton;
    private Cursor cursor;
    private JTextArea ta;

    private Font f;

    MultiplicationTable() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        //image 
        img = new ImageIcon(getClass().getResource("boy.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(50, 50, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 18);
        //JLabel Text
        textLabel = new JLabel("Enter any Number  : ");
        textLabel.setBounds(img.getIconWidth() + 150, 60, 200, 80);
        textLabel.setForeground(Color.GREEN);
        textLabel.setFont(f);
        c.add(textLabel);
        //JTextField 

        text = new JTextField();
        text.setBounds(img.getIconWidth() + 350, 80, 100, 30);
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setBackground(Color.lightGray);
        text.setFont(f);
        c.add(text);

        // JButton Clear
        clearButton = new JButton("clear");
        clearButton.setBounds(img.getIconWidth() + 360, 140, 80, 50);
        clearButton.setBackground(Color.GREEN);
        clearButton.setFont(f);

        cursor = new Cursor(Cursor.HAND_CURSOR);
        clearButton.setCursor(cursor);
        c.add(clearButton);

        //JTextArea ta 
        ta = new JTextArea();
        ta.setBounds(img.getIconWidth() + 160, 210, 220, 300);
        ta.setBackground(Color.YELLOW);
        ta.setFont(f);
        c.add(ta);

        //ActionListener on JTextArea
        text.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                String value = text.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didn't any number ");
                } else {
                    ta.setText("");

                    int num = Integer.parseInt(text.getText());
                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;
                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String inc = String.valueOf(i);

                        ta.append(n + " X " + inc + " = " + r + "\n");
                        ta.setForeground(Color.RED);

                    }
                }

            }

        });
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
            }
        });

    }

    public static void main(String[] args) {
        MultiplicationTable frame = new MultiplicationTable();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 900, 600);
        frame.setTitle("Multiplication Table ");

    }

}
