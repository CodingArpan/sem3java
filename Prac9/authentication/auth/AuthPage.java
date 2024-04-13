package auth;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AuthPage {
    public AuthPage() {

        Frame authFrame = new Frame();
        authFrame.setTitle("Authentication By @codingarpan");
        authFrame.setSize(400, 600);
        authFrame.setBounds(600, 100, 400, 600);
        authFrame.setBackground(new Color(20, 20, 20));
        authFrame.setLayout(null);
        authFrame.setVisible(true);
        Dialog d = new Dialog(authFrame, "Dialog Example", true);
        d.setLayout(new FlowLayout());
        authFrame.add(loginPanel());

        authFrame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                authFrame.dispose();
            }
        });
    }

    Panel loginPanel() {
        Panel loginPanel = new Panel();
        loginPanel.setSize(400, 800);
        loginPanel.setLayout(null);
        loginPanel.setVisible(true);

        Label title = new Label("Sign In");
        title.setBounds(50, 50, 300, 50);
        title.setFont(new Font("Roboto", Font.BOLD, 40));
        title.setForeground(new Color(255, 255, 255));

        Label username = new Label("Username");
        username.setBounds(50, 100, 300, 50);
        username.setFont(new Font("Roboto", Font.PLAIN, 15));
        username.setForeground(new Color(255, 255, 255));

        TextField usernameField = new TextField();
        usernameField.setBounds(50, 150, 300, 30);
        usernameField.setFont(new Font("Roboto", Font.PLAIN, 20));

        Label password = new Label("Password");
        password.setBounds(50, 200, 300, 50);
        password.setFont(new Font("Roboto", Font.PLAIN, 15));
        password.setForeground(new Color(255, 255, 255));

        TextField passwordField = new TextField();
        passwordField.setBounds(50, 250, 300, 30);
        passwordField.setFont(new Font("Roboto", Font.PLAIN, 20));
        JFrame frame = new JFrame();

        Button loginBtn = new Button("Log in");
        loginBtn.setBounds(50, 300, 300, 50);
        loginBtn.setBackground(new Color(2, 127, 212));
        loginBtn.setForeground(new Color(255, 255, 255));
        loginBtn.setFont(new Font("Roboto", Font.BOLD, 15));

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                String usernameVal = usernameField.getText();
                String passwordVal = passwordField.getText();
                if (usernameVal.isBlank() || passwordVal.isBlank()) {
                    JOptionPane.showMessageDialog(frame, "Username or Password is invalid");
                } else {
                    JOptionPane.showMessageDialog(frame, "Welcome " + usernameVal);
                    System.out.println("username : " + usernameVal);
                    System.out.println("password : " + passwordVal);
                }
            }
        });

        // Register Button (Not yet implemented

        Label regLabel = new Label("Don't have an account?");
        regLabel.setBounds(50, 350, 300, 50);
        regLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        regLabel.setForeground(new Color(161, 161, 161));

        Button regBtn = new Button("Register Now");
        regBtn.setBounds(50, 400, 300, 50);
        regBtn.setFont(new Font("Roboto", Font.BOLD, 15));
        regBtn.setForeground(new Color(2, 127, 212));
        regBtn.setBackground(new Color(0, 0, 0));
        regBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPanel.setVisible(false);
                loginPanel.getParent().add(registerPanel());
            }
        });

        loginPanel.add(title);
        loginPanel.add(username);
        loginPanel.add(usernameField);
        loginPanel.add(password);
        loginPanel.add(passwordField);
        loginPanel.add(loginBtn);
        loginPanel.add(regLabel);
        loginPanel.add(regBtn);

        return loginPanel;
    }

    Panel registerPanel() {
        Panel regPanel = new Panel();
        regPanel.setSize(400, 800);
        regPanel.setLayout(null);
        regPanel.setVisible(true);

        Label title = new Label("Create Account");
        title.setBounds(50, 50, 300, 50);
        title.setFont(new Font("Roboto", Font.BOLD, 40));
        title.setForeground(new Color(255, 255, 255));

        Label username = new Label("Username");
        username.setBounds(50, 100, 300, 50);
        username.setFont(new Font("Roboto", Font.PLAIN, 15));
        username.setForeground(new Color(255, 255, 255));

        TextField usernameField = new TextField();
        usernameField.setBounds(50, 150, 300, 30);
        usernameField.setFont(new Font("Roboto", Font.PLAIN, 20));

        Label fullname = new Label("Full Name");
        fullname.setBounds(50, 200, 300, 50);
        fullname.setFont(new Font("Roboto", Font.PLAIN, 15));
        fullname.setForeground(new Color(255, 255, 255));

        TextField fullnameField = new TextField();
        fullnameField.setBounds(50, 250, 300, 30);
        fullnameField.setFont(new Font("Roboto", Font.PLAIN, 20));

        Label password = new Label("Password");
        password.setBounds(50, 300, 300, 50);
        password.setFont(new Font("Roboto", Font.PLAIN, 15));
        password.setForeground(new Color(255, 255, 255));

        TextField passwordField = new TextField();
        passwordField.setBounds(50, 350, 300, 30);
        passwordField.setFont(new Font("Roboto", Font.PLAIN, 20));

        Button createAccBtn = new Button("Create Profile");
        createAccBtn.setBounds(50, 400, 300, 50);
        createAccBtn.setBackground(new Color(255, 191, 0));
        createAccBtn.setForeground(new Color(0, 0, 0));
        createAccBtn.setFont(new Font("Roboto", Font.BOLD, 15));
        createAccBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("username : " + usernameField.getText());
                System.out.println("fullname : " + fullnameField.getText());
                System.out.println("password : " + passwordField.getText());

            }
        });

        Label signinLabel = new Label("Already have an account?");
        signinLabel.setBounds(50, 450, 300, 50);
        signinLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        signinLabel.setForeground(new Color(161, 161, 161));

        Button signinBtn = new Button("LogIn Now");
        signinBtn.setBounds(50, 500, 300, 50);
        signinBtn.setFont(new Font("Roboto", Font.BOLD, 15));
        signinBtn.setForeground(new Color(255, 191, 0));
        signinBtn.setBackground(new Color(0, 0, 0));
        signinBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regPanel.setVisible(false);
                regPanel.getParent().add(loginPanel());
            }
        });

        regPanel.add(title);
        regPanel.add(username);
        regPanel.add(usernameField);
        regPanel.add(fullname);
        regPanel.add(fullnameField);
        regPanel.add(password);
        regPanel.add(passwordField);
        regPanel.add(createAccBtn);
        regPanel.add(signinLabel);
        regPanel.add(signinBtn);
        return regPanel;
    }

    
}
