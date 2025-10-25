import javax.swing.*;

class SimpleRegistrationForm {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null); // Use absolute layout for simplicity

        // Labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 30, 80, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(100, 30, 150, 25);
        frame.add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 70, 80, 25);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(100, 70, 150, 25);
        frame.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 110, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 110, 150, 25);
        frame.add(passwordField);

        // Buttons
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(50, 160, 80, 25);
        frame.add(submitButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(150, 160, 80, 25);
        frame.add(resetButton);

        // Action listeners
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Registration Successful!\nName: " + name + "\nEmail: " + email);
            }
        });

        resetButton.addActionListener(e -> {
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
