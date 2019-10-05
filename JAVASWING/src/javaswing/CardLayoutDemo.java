package javaswing;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo extends JFrame implements ActionListener {

    private Container c;

    private CardLayout card;
    private JButton bt1, bt2, bt3;

    CardLayoutDemo() {
        c = this.getContentPane();
        card = new CardLayout();
        c.setLayout(card);
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");

        c.add(bt1, "First ");
        c.add(bt2, "Second");
        c.add(bt3, "Third ");
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        card.next(c);
        //card.show(c, "Second");
    }

    public static void main(String[] args) {
        CardLayoutDemo frame = new CardLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 400, 450);

    }

}
