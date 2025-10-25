import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LayoutExample extends JFrame {
    JLabel label1, label2, label3;
    FlowLayout layout;

    // Constructor
    public LayoutExample() {
        // Initialize FlowLayout and set it to the JFrame
        layout = new FlowLayout();
        this.setLayout(layout);

        // Set title of JFrame
        this.setTitle("FlowLayout Example with Alignment Control");

        // Initialize JLabels
        label1 = new JLabel("Label 1");
        label2 = new JLabel("Label 2");
        label3 = new JLabel("Label 3");

        // Add labels to JFrame
        this.add(label1);
        this.add(label2);
        this.add(label3);

        // Button to change alignment to RIGHT
        JButton alignRightButton = new JButton("Set right Alignment");
        alignRightButton.addActionListener(e -> {
            layout.setAlignment(FlowLayout.RIGHT);
            this.revalidate(); // Refresh layout after alignment change
        });

        // Button to check current alignment
        JButton checkAlignmentButton = new JButton("Check Alignment");
        checkAlignmentButton.addActionListener(e -> {
            int alignment = layout.getAlignment();
            String alignmentText = switch (alignment) {
                case FlowLayout.LEFT -> "Left";
                case FlowLayout.CENTER -> "Center";
                case FlowLayout.RIGHT -> "Right";
                case FlowLayout.LEADING -> "Leading";
                case FlowLayout.TRAILING -> "Trailing";
                default -> "Unknown";
            };
            JOptionPane.showMessageDialog(this, "Current Alignment: " + alignmentText);
        });

        // Button to remove label2 from layout
        JButton removeLabelButton = new JButton("Remove Label 2");
        removeLabelButton.addActionListener(e -> {
            layout.removeLayoutComponent(label2);
            this.remove(label2);  // Remove label2 from JFrame as well
            this.revalidate();
            this.repaint();
        });

        // Add buttons to JFrame
        this.add(alignRightButton);
        this.add(checkAlignmentButton);
        this.add(removeLabelButton);
    }

    // Main method
    public static void main(String[] args) {
        LayoutExample frame = new LayoutExample();
        frame.setBounds(200, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
