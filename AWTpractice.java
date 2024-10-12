//import java.awt.*;
//
//public class AWTpractice extends Frame {
//    Label userLabel, passLabel;
//    TextField username, password;
//    Button loginButton, clearButton;
//
//    AWTpractice() {
//        // Set layout for the frame
//        setLayout(new FlowLayout());
//
//        // Create components
//        userLabel = new Label("Username:");
//        passLabel = new Label("Password:");
//        username = new TextField(20); // Text field for username
//        password = new TextField(20); // Text field for password
//        password.setEchoChar('*'); // Mask the password
//
//        loginButton = new Button("Login");
//        clearButton = new Button("Clear");
//
//        // Add components to the frame
//        add(userLabel);
//        add(username);
//        add(passLabel);
//        add(password);
//        add(loginButton);
//        add(clearButton);
//
//        // Set frame properties
//        setTitle("Login Screen");
//        setSize(300, 150);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new AWTpractice(); // Create and show the frame
//    }
//}




//import javax.swing.*;
//import java.awt.event.*;
//import java.awt.event.ActionListener;
//
//public class StringManipulatorSwing extends JFrame implements ActionListener {
//    JTextField input1, input2, result;
//    JButton concatenateBtn, reverseBtn;
//
//    public StringManipulatorSwing() {
//        // Set layout and basic settings
//        setLayout(null);
//
//        // Text fields
//        input1 = new JTextField();
//        input1.setBounds(50, 50, 150, 20);
//        add(input1);
//
//        input2 = new JTextField();
//        input2.setBounds(50, 80, 150, 20);
//        add(input2);
//
//        result = new JTextField();
//        result.setBounds(50, 140, 150, 20);
//        result.setEditable(false);  // Make result text field non-editable
//        add(result);
//
//        // Buttons
//        concatenateBtn = new JButton("Concatenate");
//        concatenateBtn.setBounds(50, 110, 150, 30);
//        add(concatenateBtn);
//
//        reverseBtn = new JButton("Reverse");
//        reverseBtn.setBounds(210, 110, 100, 30);
//        add(reverseBtn);
//
//        // Add action listeners
//        concatenateBtn.addActionListener(this);
//        reverseBtn.addActionListener(this);
//
//        // Frame settings
//        setTitle("String Manipulator");
//        setSize(350, 250);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
//    }
//
//    // Handle button clicks
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == concatenateBtn) {
//            // Concatenate input1 and input2 and display in result
//            String concatenated = input1.getText() + input2.getText();
//            result.setText(concatenated);
//        } else if (e.getSource() == reverseBtn) {
//            // Reverse input1 and display in result
//            StringBuilder reversed = new StringBuilder(input1.getText());
//            result.setText(reversed.reverse().toString());
//        }
//    }
//
//    public static void main(String[] args) {
//        new StringManipulatorSwing();  // Launch the window
//    }
//}


