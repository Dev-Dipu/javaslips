//Write a program to design a screen using Awt that will take a user name and password. If
//        the user name and password are not same, raise an Exception with appropriate message.
//        User can have 3 login chances only. Use clear button to clear the TextFields.


import java.awt.*;
import java.awt.event.*;

// Custom exception for login failure
class LoginException extends Exception {
    public LoginException(String message) {
        super(message);
    }
}

// Main class for the GUI
public class Slip4_b extends Frame implements ActionListener {
    Label lblUser, lblPassword, lblMessage;
    TextField txtUser, txtPassword;
    Button btnLogin, btnClear;
    int attempts = 3;  // User gets 3 login attempts

    // Constructor to set up the GUI components
    public Slip4_b() {
        // Set the frame title
        super("Login Screen");

        // Create components
        lblUser = new Label("Username:");
        lblPassword = new Label("Password:");
        lblMessage = new Label("");
        txtUser = new TextField(20);
        txtPassword = new TextField(20);
        txtPassword.setEchoChar('*');  // Hide password input
        btnLogin = new Button("Login");
        btnClear = new Button("Clear");

        // Add components to the frame
        setLayout(new FlowLayout());

        add(lblUser);
        add(txtUser);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);
        add(btnClear);
        add(lblMessage);

        // Add action listeners to buttons
        btnLogin.addActionListener(this);
        btnClear.addActionListener(this);

        // Set frame properties
        setSize(300, 200);
        setVisible(true);

        // Close window action
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Method to handle button click events
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            try {
                // Check if username and password are the same
                if (txtUser.getText().equals(txtPassword.getText())) {
                    lblMessage.setText("Login Successful!");
                } else {
                    attempts--;
                    throw new LoginException("Invalid username or password. Attempts left: " + attempts);
                }

                // Check if the user has exceeded the maximum attempts
                if (attempts == 0) {
                    lblMessage.setText("No more login attempts allowed.");
                    btnLogin.setEnabled(false);  // Disable login button
                }
            } catch (LoginException ex) {
                lblMessage.setText(ex.getMessage());
            }
        } else if (e.getSource() == btnClear) {
            // Clear text fields
            txtUser.setText("");
            txtPassword.setText("");
            lblMessage.setText("");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        new Slip4_b();
    }
}
