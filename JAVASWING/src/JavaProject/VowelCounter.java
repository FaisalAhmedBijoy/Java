package JavaProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javaswing.TextAreaDemo;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class VowelCounter extends JFrame {

    private Container c;
    private JLabel input, total, aLabel, oLabel, eLabel, iLabel, uLabel;
    private JTextArea ta;
    int totalvowel = 0, letterA = 0, letterE = 0, letterI = 0, letterO = 0, letterU = 0;
    private Font f;

    VowelCounter() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 15);

        input = new JLabel("Enter any Text : ");
        input.setBounds(50, 50, 150, 30);
        input.setFont(f);
        c.add(input);
        ta = new JTextArea();
        ta.setBounds(250, 40, 250, 300);
        // c.add(ta);

        total = new JLabel("Total Number of vowel : ");
        total.setFont(f);
        total.setBounds(20, 150, 200, 30);
        // total
        aLabel = new JLabel();
        aLabel.setBounds(20, 200, 200, 30);
        eLabel = new JLabel();
        eLabel.setBounds(20, 250, 200, 30);
        iLabel = new JLabel();
        iLabel.setBounds(20, 300, 200, 30);
        oLabel = new JLabel();
        oLabel.setBounds(20, 350, 200, 30);
        uLabel = new JLabel();
        uLabel.setBounds(20, 400, 200, 30);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setBackground(Color.GREEN);

        c.add(total);
        c.add(aLabel);
        c.add(eLabel);
        c.add(iLabel);
        c.add(oLabel);
        c.add(uLabel);

        ta.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {

                if (ke.getSource() == ta) {
                    if (ke.VK_A == ke.getKeyCode()) {
                        letterA++;
                        totalvowel++;
                    }

                    if (ke.VK_E == ke.getKeyCode()) {
                        letterE++;
                        totalvowel++;
                    }
                    if (ke.VK_I == ke.getKeyCode()) {
                        letterI++;
                        totalvowel++;
                    }
                    if (ke.VK_O == ke.getKeyCode()) {
                        letterO++;
                        totalvowel++;
                    }
                    if (ke.VK_U == ke.getKeyCode()) {
                        letterU++;
                        totalvowel++;
                    }

                }
                total.setText("Total Vowel  : " + totalvowel);
                aLabel.setText("a Vowel  : " + letterA);
                eLabel.setText("e Vowel  : " + letterE);
                iLabel.setText("i Vowel  : " + letterI);
                oLabel.setText("o Vowel  : " + letterO);
                uLabel.setText("u Vowel  : " + letterU);

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        c.add(ta);

    }

    public static void main(String[] args) {
        VowelCounter frame = new VowelCounter();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 600, 500);

    }

}
