package io.github.vkb24312.asciiCoder;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    //<editor-fold desc="Declaration and Initialisation">
    public JFrame frame = new JFrame("ASCII coder");
    public JLabel inputlabel = new JLabel("Input:");
    public JTextField input = new JTextField();
    public JLabel outputlabel = new JLabel("Output:");
    public JTextArea output = new JTextArea("Your output will display here when you press the button below", 10, 10);
    public JButton button = new JButton("CODE IT");
    public JPanel panel = new JPanel(new FlowLayout());
    public JRadioButton normalMessage = new JRadioButton("Code this", true);
    public JRadioButton codedMessage = new JRadioButton("Decode this");
    public JLabel passwordlabel = new JLabel("Password:");
    public JPasswordField password = new JPasswordField();
    //</editor-fold>
    public MainFrame(){
        ButtonGroup messageTypeGroup = new ButtonGroup();
        messageTypeGroup.add(normalMessage);
        messageTypeGroup.add(codedMessage);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JScrollPane scrollPane = new JScrollPane(output);
        frame.setVisible(true);
        input.setPreferredSize(new Dimension(250, 50));
        output.setPreferredSize(new Dimension(250, 50));
        button.setPreferredSize(new Dimension(100, 50));
        password.setPreferredSize(new Dimension(250, 25));
        scrollPane.setPreferredSize(new Dimension(250, 50));
        frame.setSize(new Dimension(300, 325));
        frame.setDefaultCloseOperation(3);
        output.setEditable(false);
        frame.setResizable(false);

        frame.add(panel);
        panel.add(inputlabel);
        panel.add(new JLabel());
        panel.add(input);
        panel.add(passwordlabel);
        panel.add(password);
        panel.add(outputlabel);
        panel.add(scrollPane);
        panel.add(normalMessage);
        panel.add(codedMessage);
        panel.add(new JLabel("  "));
        panel.add(button);

        output.setText("Your output will display here");
    }
}
