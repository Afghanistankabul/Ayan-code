package Gui;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("Password");
        label.setBounds(10,50,80,25);
        panel.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(100,20,160,25);
        panel.add(textField);

        JLabel passwordLabel = new JLabel("User");
        passwordLabel.setBounds(10,20,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(10,80,80,25);
        panel.add(button);



        frame.setVisible(true);








    }
}
