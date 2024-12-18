import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GUI {



    public static void main() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);

        JLabel label = new JLabel("Podaj liczbe plusów");
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(0, 0, 490, 200);
        label.setForeground(Color.BLACK);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.WHITE);
        textArea.setForeground(Color.BLACK);
        textArea.setBounds(55, 150, 400, 25);

        JTextArea textArea2 = new JTextArea();
        textArea2.setFont(new Font("Arial", Font.PLAIN, 20));
        textArea2.setEditable(false);
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);
        textArea2.setBackground(Color.WHITE);
        textArea2.setForeground(Color.BLACK);
        textArea2.setBounds(70, 280, 190, 25);

        JTextArea textArea3 = new JTextArea();
        textArea3.setFont(new Font("Arial", Font.PLAIN, 20));
        textArea3.setEditable(false);
        textArea3.setLineWrap(true);
        textArea3.setWrapStyleWord(true);
        textArea3.setBackground(Color.WHITE);
        textArea3.setForeground(Color.BLACK);
        textArea3.setBounds(70, 310, 190, 25);

        JButton button = new JButton("Zatwierdz");
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setBounds(70, 200, 350, 25);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.WHITE);

        JButton button2 = new JButton("Wyczyść");
        button2.setFont(new Font("Arial", Font.PLAIN, 20));
        button2.setHorizontalAlignment(SwingConstants.CENTER);
        button2.setBounds(70, 230, 350, 25);
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.WHITE);



        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String s = textArea.getText();
                int sumaPlusow = 0;
                for(int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == '+') {
                        sumaPlusow++;
                    }
                    if(s.charAt(i) == '-') {
                        sumaPlusow--;
                    }
                }
                System.out.println(sumaPlusow);

                int sumaPiatek = 0;
                int resztaPlusówn = sumaPlusow;
                if(sumaPlusow >= 5) {
                    sumaPiatek += 1;
                    resztaPlusówn = resztaPlusówn - 5;
                }
                if(sumaPlusow >= 10) {
                    sumaPiatek += 1;
                    resztaPlusówn = resztaPlusówn - 5;
                }
                if(sumaPlusow >= 15) {
                    sumaPiatek += 1;
                    resztaPlusówn = resztaPlusówn - 5;
                }
                if(sumaPlusow >= 20) {
                    sumaPiatek += 1;
                    resztaPlusówn = resztaPlusówn- 5;
                }
                if(sumaPlusow >= 25) {
                    sumaPiatek +=1;
                    resztaPlusówn = resztaPlusówn - 5;
                }
                if(sumaPlusow >= 30) {
                    sumaPiatek+=1;
                    resztaPlusówn = resztaPlusówn - 5;
                }
                if(sumaPlusow >= 35) {
                    sumaPiatek+=1;
                    resztaPlusówn = resztaPlusówn - 5;
                }
                textArea2.setText("Suma piątek to: "+sumaPiatek);
                textArea3.setText("Reszta plusów to: "+resztaPlusówn);
                System.out.println("Suma piątek to: "+ sumaPiatek);
                System.out.println("Reszta plusów: "+ resztaPlusówn);
            }


        });


        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea2.setText("");
                textArea3.setText("");
                textArea.setText("");
            }
        });

        frame.add(button2);
        frame.add(button);
        frame.add(textArea);
        frame.add(textArea2);
        frame.add(textArea3);
        frame.add(label);
        frame.setVisible(true);










    }
}
